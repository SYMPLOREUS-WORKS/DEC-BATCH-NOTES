package com.bharath.billgenerator.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bharath.billgenerator.dto.ItemDTO;
import com.bharath.billgenerator.entity.Item;
import com.bharath.billgenerator.exception.ItemAlreadyAddedException;
import com.bharath.billgenerator.exception.NoItemFoundException;
import com.bharath.billgenerator.exception.NoItemsFoundException;
import com.bharath.billgenerator.exception.NoItemsFoundInMenuException;
import com.bharath.billgenerator.repository.ItemRepository;

import jakarta.transaction.Transactional;

@Service(value = "menuService")
public class MenuServiceImpl implements MenuService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuServiceImpl.class);

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public ItemDTO addItemToMenu(ItemDTO itemDTO) {
		// need to convert itemdto->item entity
		// need to set mandatory fields to entity
		// save to db
	Optional<Item> optionalItem=	itemRepository.findByItemNAme(itemDTO.getItemName());
		if(optionalItem.isEmpty()) {
			Item item = new Item();
			item.setItemName(itemDTO.getItemName());
			item.setCategory(itemDTO.getCategory());
			item.setPrice(itemDTO.getPrice());
			item.setAddedAt(LocalDateTime.now());
			// item.setItemId(itemDTO.getItemId());
			item = itemRepository.save(item);
			itemDTO.setItemId(item.getItemId());
			return itemDTO;
		}
		else throw new ItemAlreadyAddedException("Item with name :"+itemDTO.getItemName()+" already available");
	}

	private ItemDTO convertToDTO(Item item) {

		ItemDTO dto = new ItemDTO();
		dto.setItemId(item.getItemId());
		dto.setItemName(item.getItemName());
		dto.setCategory(item.getCategory());
		dto.setPrice(item.getPrice());
		return dto;
	}

	@Override
	public List<ItemDTO> viewMenu() {
		// call db and get data from table
		// convert each entity to dto and return it
		List<Item> items = itemRepository.findAll();
		if (items != null && !items.isEmpty())

			return items.stream().map(item -> convertToDTO(item)).toList();

		throw new NoItemsFoundInMenuException("Items not available in the menu");
	}

	@Override
	public ItemDTO viewItemByName(String name) {
		// call repo get the entity with nae as where condition
		// convert entity to dto
		Optional<Item> optionalItem = itemRepository.findByItemNAme(name);

		if (optionalItem.isPresent())
			return convertToDTO(optionalItem.get());
		throw new NoItemFoundException("Item with name " + name + " not found");
	}

	@Override
	@Transactional(rollbackOn = { ClassNotFoundException.class })
	public ItemDTO updateItemPrice(String nameOfItem, Double newPrice) throws ClassNotFoundException {
		Optional<Item> optionalItem = itemRepository.findByItemNAme(nameOfItem);

		if (optionalItem.isPresent()) {
			// update price
			LOGGER.info("updating the db ");
			itemRepository.updatePriceOfItem(nameOfItem, newPrice);
			LOGGER.info("update db successful");
			Item item = optionalItem.get();
			item.setPrice(newPrice);
			LOGGER.info("throwing an exception to undertand @Transactional use");
			// System.out.println(10/0);
			// Class.forName("bharathclass");
			return convertToDTO(item);
		}
		throw new NoItemFoundException("Item with name " + nameOfItem + " not found");
	}

	@Override
	@Transactional
	public ItemDTO updateCategoryByItemName(String itemName, String newCategory) {
		// check product availability
		// if avaiable update else throw exception
		Optional<Item> optionalItem = itemRepository.findByItemNAme(itemName);

		if (optionalItem.isPresent()) {
			// update price
			LOGGER.info("updating the db ");
			itemRepository.updateCategoryByName(newCategory, itemName);
			LOGGER.info("update db successful");
			Item item = optionalItem.get();
			item.setCategory(newCategory);

			return convertToDTO(item);
		}
		throw new NoItemFoundException("Item with name " + itemName + " not found");
	}

	@Override
	public List<ItemDTO> viewItemsByCategory(String category) {
		// invoke db with category filter which we used as named query
		List<Item> items = itemRepository.findItemsBasedOnCategory(category);

		// covert items to item dtos
		if (items != null && !items.isEmpty()) {
			return items.stream().map(item -> convertToDTO(item)).toList();
		}
		throw new NoItemsFoundException("items not found with provided category " + category);
	}

	@Override
	public List<ItemDTO> sortItemsByColumnName(String... columnName) {

		// Sort sort=null;
//		for(String name:columnName) {
//			sort=Sort.by(name);
//			Sort tmpSort=Sort.by(name);
//			sort=sort.and(tmpSort);
//		}
		Sort sort = Sort.by(columnName).descending();
		List<Item> items = itemRepository.findAll(sort);

		if (items != null && !items.isEmpty()) {
			return items.stream().map(item -> convertToDTO(item)).toList();
		}
		throw new NoItemsFoundException("items not found with provided sort " + columnName);
	}

	@Override
	public List<ItemDTO> viewInPage(int pageNo, int noOfRows) {
		Pageable pageable = PageRequest.of(pageNo, noOfRows);
		Page<Item> page = itemRepository.findAll(pageable);

		List<ItemDTO> dtos = new ArrayList<ItemDTO>();
		if (page.hasNext()) {
			List<Item> items = page.getContent();
			List<ItemDTO> dto = items.stream().map(item -> convertToDTO(item)).toList();
			dtos.addAll(dto);
		}

		return dtos;
	}

}
