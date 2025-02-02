package com.bharath.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UI {

	public static void main(String[] args) {
		System.out.println("main method start");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		EmployeeController employeeController = (EmployeeController) context.getBean("employeeController");
		employeeController.controller();
		System.out.println("main method end");
	}

}
