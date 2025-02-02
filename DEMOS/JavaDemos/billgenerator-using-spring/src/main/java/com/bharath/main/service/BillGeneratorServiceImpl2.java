package com.bharath.main.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("newService")
//@Primary
public class BillGeneratorServiceImpl2 implements BillGeneratorService {

	@Override
	public void viewMenu() {
		System.out.println("new viewMenu() as we dont like previous impl calling other microservice for data");

	}

	@Override
	public void addItemMenu() {
		System.out.println("add item using new logic");

	}

}
