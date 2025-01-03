package com.bharath.task.service;

import java.util.List;

import com.bharath.task.dto.ItemDTO;
import com.bharath.task.dto.MenuDTO;
import com.bharath.task.dto.OrderDTO;

public interface BillGeneratorService {

	public  List<MenuDTO> viewMenu();
	
	public ItemDTO addItemToMenu(ItemDTO dto);
	
	public List<OrderDTO> placeOrder(List<OrderDTO> orders);
}
