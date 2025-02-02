package com.bharath.billgenerator.service;

import java.util.List;

import com.bharath.billgenerator.dto.ItemDTO;

public interface MenuService {
	ItemDTO addItemToMenu(ItemDTO item);

	List<ItemDTO> viewMenu();

	ItemDTO viewItemByName(String name);

	ItemDTO updateItemPrice(String nameOfItem, Double newPrice ) throws Exception;

	ItemDTO updateCategoryByItemName(String itemName, String newCategory);

	List<ItemDTO> viewItemsByCategory(String category);
	

}
