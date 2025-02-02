package com.bharath.java;

public class Controller {

	private Service service = new Service();

	public void controller() {
		System.out.println("controller");
		service.service();
	}
}
