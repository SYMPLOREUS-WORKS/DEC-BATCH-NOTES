package com.bharath.billgenerator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bharath.billgenerator.controller.MenuController;
import com.bharath.billgenerator.dto.ItemDTO;

@SpringBootApplication
public class BillGenerationApplication implements CommandLineRunner {

	@Autowired
	private MenuController menuController;

	public static void main(String[] args) {
		SpringApplication.run(BillGenerationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// addItemToMenu();
		// viewMenu();
		 //viewItemByName();
		updatePriceByItemName();
		//updateCategoryByName();

	}

	private void updateCategoryByName() {
		String newCategory = "FAST FOOD";
		String itemName = "PizZa";
		ItemDTO dto = menuController.updateCategoryByItemName(itemName, newCategory);
		System.out.println(dto);

	}

	private void updatePriceByItemName() {
		String nameOfItem = "COKE";
		Double updatPrice = 150.0;
		ItemDTO itemDTO = null;
		try {
			itemDTO = menuController.updateItemPriceByName(nameOfItem, updatPrice);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(itemDTO);
	}

	private void viewItemByName() {
		String name = "FRIEs";
		ItemDTO itemDTO = menuController.viewItemByName(name);
		System.out.println(itemDTO);

	}

	private void viewMenu() {
		List<ItemDTO> menuItems = menuController.viewMenu();

		menuItems.stream().forEach(dto -> System.out.println(dto));

	}

	private void addItemToMenu() {
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setCategory("SNACKS");
		itemDTO.setItemName("SAMOSA");
		itemDTO.setPrice(10.0);
		itemDTO.setItemId(2L);

		menuController.addItemToMenu(itemDTO);
	}

}
