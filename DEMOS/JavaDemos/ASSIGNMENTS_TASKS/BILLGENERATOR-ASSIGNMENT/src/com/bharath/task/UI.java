package com.bharath.task;

import java.util.List;
import java.util.Scanner;

import com.bharath.task.controller.BillGeneratorController;
import com.bharath.task.controller.BillGeneratorControllerImpl;
import com.bharath.task.dto.ItemDTO;
import com.bharath.task.dto.MenuDTO;

public class UI {
	static {
		System.out.println("Welcome to ABC Restaurant");
	}

	public static void main(String[] args) {
		// viewMenu();

		 addItemToMenu();

		// placeOrder();

	}

	private static void placeOrder() {

	}

	private static void addItemToMenu() {

		System.out.println("Add Item to menu");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter price");
		Double price = sc.nextDouble();
		System.out.println("Enter description");
		String description = sc.next();

		System.out.println("Please confirm details of item");
		System.out.println("name :" + name + "\n" + "price :" + price + "\n" + "description :" + description);
		System.out.println("Press Y to process ,N to cancel");
		String response = sc.next();
		if (response != null && response.equalsIgnoreCase("y")) {
			// invoke controller additem method
			
			ItemDTO itemDTO= new ItemDTO();
			item.set
		} else {
			System.out.println("Thank you");
			System.exit(0);
		}

	}

	private static void viewMenu() {
//hhhhhhhh
		System.out.println("Welcome to ABC Restaurant");
		System.out.println("Enter Y to display menu");

		Scanner scanner = new Scanner(System.in);
		String response = scanner.next("[YN]");
		if (response != null && response.equalsIgnoreCase("Y")) {
			// invoke the view menu method of controller class
			BillGeneratorController controller = new BillGeneratorControllerImpl();
			List<MenuDTO> menuResponse = controller.viewMenu();
			if (menuResponse != null && !menuResponse.isEmpty()) {
				// iterate response
				System.out.println("==============================================================");
				System.out.println("\tABC Menu Details\t");
				System.out.println("==============================================================");
				System.out.println("SNO\tNAME\tPRICE\tDESCRIPTION");
				System.out.println("==============================================================");
				for (MenuDTO dto : menuResponse) {
					if (dto != null) {
						System.out.println(dto.getMenuId() + "\t" + dto.getName() + "\t" + dto.getPrice() + "\t"
								+ dto.getDescription() + "\t");
					}
				}
				System.out.println("==============================================================");
			}

		} else {

			//
			System.out.println("We didnot recived a correct response");
		}

	}

}