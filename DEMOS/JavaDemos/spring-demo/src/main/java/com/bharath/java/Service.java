package com.bharath.java;

public class Service {
	private Repository repository = new Repository();

	public void service() {
		System.out.println("executing business logic");
		repository.repository();
	}
}
