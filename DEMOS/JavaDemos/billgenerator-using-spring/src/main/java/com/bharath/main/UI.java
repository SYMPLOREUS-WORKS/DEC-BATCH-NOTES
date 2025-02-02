package com.bharath.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bharath.main.controller.BillGeneratorController;

public class UI {

	public static void main(String[] args) {
		System.out.println("main method start");
		;
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		BillGeneratorController billGeneratorController = context.getBean(BillGeneratorController.class);
		//billGeneratorController.viewMenu();
		billGeneratorController.addItemtoMenu();

	}

}
