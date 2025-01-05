package com.bharath.task.service;

import java.util.ArrayList;
import java.util.List;

import com.bharath.task.dto.ItemDTO;
import com.bharath.task.dto.MenuDTO;
import com.bharath.task.dto.OrderDTO;
import com.bharath.task.entity.Menu;
import com.bharath.task.exception.BillGeneratorException;
import com.bharath.task.repository.BillGeneratorRepository;
import com.bharath.task.repository.BillGeneratorRepositoryImpl;

public class BillGeneratorServiceImpl implements BillGeneratorService {

	@Override
	public List<MenuDTO> viewMenu() {
		// invoke repo layer to get menu from db(dummy list)
		// convert menu object to MENUDTOobject
		// return the LIst menudto
		List<MenuDTO> menuDTOs = new ArrayList();
		BillGeneratorRepository billGeneratorRepository = new BillGeneratorRepositoryImpl();
		List<Menu> repoMenu = billGeneratorRepository.findAllMenuItems();
		if (repoMenu != null && !repoMenu.isEmpty()) {

			for (Menu menu : repoMenu) {
				MenuDTO menuDTO = new MenuDTO(menu.getMenuID(), menu.getName(), menu.getPrice(), menu.getDescription());
				menuDTOs.add(menuDTO);
			}
			return menuDTOs;
		} else {
			throw new BillGeneratorException("NO ITEMS IN THE MENU");
		}

	}

	@Override
	public ItemDTO addItemToMenu(ItemDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> placeOrder(List<OrderDTO> orders) {
		// TODO Auto-generated method stub
		return null;
	}

}
