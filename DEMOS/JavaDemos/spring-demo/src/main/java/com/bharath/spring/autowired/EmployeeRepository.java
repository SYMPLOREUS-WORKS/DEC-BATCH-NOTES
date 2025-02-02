package com.bharath.spring.autowired;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
	public EmployeeRepository() {
		System.out.println("repo constructor");
	}

	public void repository() {
		System.out.println("employee db transaction");

	}

}
