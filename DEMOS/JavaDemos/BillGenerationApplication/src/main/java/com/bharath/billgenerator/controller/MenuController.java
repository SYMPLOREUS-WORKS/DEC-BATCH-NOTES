package com.bharath.billgenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bharath.billgenerator.dto.ItemDTO;
import com.bharath.billgenerator.service.MenuService;

@Controller(value = "menuController")
public class MenuController {
	@Autowired
	private MenuService menuService;

	public ItemDTO addItemToMenu(ItemDTO itemDTO) {
		return menuService.addItemToMenu(itemDTO);
	}

	public List<ItemDTO> viewMenu() {
		
		return menuService.viewMenu();
	}

	public ItemDTO viewItemByName(String name) {
		
		return menuService.viewItemByName(name);
	}

	public ItemDTO updateItemPriceByName(String nameOfItem, Double updatPrice) throws Exception {
	
		ItemDTO dto=menuService.updateItemPrice(nameOfItem, updatPrice);
		return dto;
	}

	public ItemDTO updateCategoryByItemName(String itemName, String newCategory) {
		
		return menuService.updateCategoryByItemName(itemName,newCategory);
	}

	public List<ItemDTO> viewItemsByCategory(String category) {
		
		return menuService.viewItemsByCategory(category);
	}
}
