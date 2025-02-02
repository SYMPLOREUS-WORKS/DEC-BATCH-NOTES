package com.bharath.iocdemo;

public class UI {

	public static void main(String[] args) {
		Repository repo = new Repository();
		Service service = new Service(repo);
		Controller controller = new Controller(service);
		controller.controller();

	}

}
