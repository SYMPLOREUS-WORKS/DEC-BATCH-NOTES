package com.bharath.iocdemo;

public class Controller {
	
	private Service service;
	
	public Controller(Service service) {
		System.out.println("controller constructor called with service param");
		this.service=service;
	}

	public void controller() {
		System.out.println("controller");
		service.service();
	}
}
