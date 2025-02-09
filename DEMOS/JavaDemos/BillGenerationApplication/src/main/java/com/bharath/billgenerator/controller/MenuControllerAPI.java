package com.bharath.billgenerator.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bharath.billgenerator.dto.ItemDTO;
import com.bharath.billgenerator.service.MenuService;

//@Controller
@RequestMapping("/menu")
//@ResponseBody
@RestController
public class MenuControllerAPI {
	@Autowired
	private MenuService menuService;

	// dummy endpoint
	@RequestMapping(method = RequestMethod.GET, value = "/dummy")
	// @ResponseBody
	public String dummyController() {
		System.out.println("dummy method called");
		return "Hello world !!! THis is dummy controller";
	}

	@PostMapping(value = "add-item")
	//public ItemDTO addItemToMenu(@RequestBody ItemDTO itemDTO) {
		public ItemDTO addItemToMenu(@ModelAttribute ItemDTO itemDTO) {
		
	MultipartFile fileInfo=	itemDTO.getFile();
	String filename=fileInfo.getOriginalFilename();
	System.out.println(filename);
	try {
		fileInfo.getBytes();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fileInfo.getInputStream();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return menuService.addItemToMenu(itemDTO);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/view-menu")
	// @ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public List<ItemDTO> viewMenu() {

		return menuService.viewMenu();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/view-item/{item-name}")
	// @ResponseBody
	public ResponseEntity<ItemDTO> viewItemByName(@PathVariable(name = "item-name", required = true) String name) {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("fnmae", "bharath");
		return new ResponseEntity<ItemDTO>(menuService.viewItemByName(name), headers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update-item/price/{new-price}/name/{item-name}")
	// @ResponseBody
	public ItemDTO updateItemPriceByName(@PathVariable(name = "item-name", required = true) String nameOfItem,
			@PathVariable(name = "new-price", required = true) Double updatPrice) throws Exception {

		ItemDTO dto = menuService.updateItemPrice(nameOfItem, updatPrice);
		return dto;
	}

	@PutMapping(value = "update-item/category")
	public ResponseEntity<ItemDTO> updateCategoryByItemName(
			@RequestParam(name = "item-name", required = true) String itemName,
			@RequestParam(name = "category", required = true) String newCategory) {

		return new ResponseEntity<ItemDTO>(menuService.updateCategoryByItemName(itemName, newCategory), HttpStatus.OK);
	}

	public List<ItemDTO> viewItemsByCategory(String category) {

		return menuService.viewItemsByCategory(category);
	}

	public List<ItemDTO> sortByColumnName(String... columnName) {

		return menuService.sortItemsByColumnName(columnName);
	}

	public List<ItemDTO> viewInPage(int pageNo, int noOfRows) {

		return menuService.viewInPage(pageNo, noOfRows);
	}
	
	
}
