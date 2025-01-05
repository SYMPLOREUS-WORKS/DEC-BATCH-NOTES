package com.bharath.task.repository;

import java.util.ArrayList;
import java.util.List;

import com.bharath.task.entity.Menu;

public class BillGeneratorRepositoryImpl implements BillGeneratorRepository {

	@Override
	public List<Menu> findAllMenuItems() {
		List<Menu> menuItems = new ArrayList();

		Menu menu1 = new Menu();
		menu1.setMenuID(1l);
		menu1.setName("CHIPS");
		menu1.setPrice(15.0);
		menu1.setDescription("SNACKS");

		menuItems.add(menu1);

		Menu menu2 = new Menu();
		menu2.setMenuID(2l);
		menu2.setName("BISCUITS");
		menu2.setPrice(10.0);
		menu2.setDescription("SNACKS");

		menuItems.add(menu2);

		Menu menu3 = new Menu(3l, "COKE", 10.0, "BEVERAGE");

		menuItems.add(menu3);

		return menuItems;
	}

}
