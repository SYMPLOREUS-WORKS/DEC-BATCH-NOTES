package com.bharath.iocdemo;

public class Service {
	private Repository repository;

	public Service(Repository repository) {
		System.out.println("service cons called with repo instance param");
		this.repository = repository;
	}

	public void service() {
		System.out.println("executing business logic");
		repository.repository();
	}
}
