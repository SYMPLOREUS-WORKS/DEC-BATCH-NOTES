package com.bharath.task.controller;

import java.util.List;

import com.bharath.task.dto.ItemDTO;
import com.bharath.task.dto.MenuDTO;
import com.bharath.task.dto.OrderDTO;

public interface BillGeneratorController {

	
	public List<MenuDTO> viewMenu();
	
	public ItemDTO addItemToMenu(ItemDTO dto);
	
	
	public List<OrderDTO> placeOrder(List<OrderDTO> orderItems);
	
}
