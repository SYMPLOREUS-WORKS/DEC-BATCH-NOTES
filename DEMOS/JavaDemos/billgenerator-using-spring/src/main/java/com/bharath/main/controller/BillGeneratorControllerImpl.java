package com.bharath.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.bharath.main.service.BillGeneratorService;

@Controller()
public class BillGeneratorControllerImpl implements BillGeneratorController {

	private BillGeneratorService billGeneratorService;
	@Autowired
	@Qualifier("newService")
	private BillGeneratorService billGeneratorService2;

	@Autowired
	public BillGeneratorControllerImpl(@Qualifier("oldService") BillGeneratorService billGeneratorService) {
		this.billGeneratorService = billGeneratorService;
	}

	@Override
	public void viewMenu() {
		System.out.println("controller viewMenu() calling service");
		billGeneratorService.viewMenu();

	}

	@Override
	public void addItemtoMenu() {
		billGeneratorService2.addItemMenu();

	}

}
