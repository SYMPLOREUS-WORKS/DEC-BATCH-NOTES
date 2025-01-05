package com.bharath.task.controller;

import java.util.List;

import com.bharath.task.dto.ItemDTO;
import com.bharath.task.dto.MenuDTO;
import com.bharath.task.dto.OrderDTO;
import com.bharath.task.service.BillGeneratorService;
import com.bharath.task.service.BillGeneratorServiceImpl;

public class BillGeneratorControllerImpl implements BillGeneratorController {

	@Override
	public List<MenuDTO> viewMenu() {

		BillGeneratorService billGeneratorService = new BillGeneratorServiceImpl();
		List<MenuDTO> menu = billGeneratorService.viewMenu();
		return menu;
	}

	@Override
	public ItemDTO addItemToMenu(ItemDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> placeOrder(List<OrderDTO> orderItems) {
		// TODO Auto-generated method stub
		return null;
	}

}
