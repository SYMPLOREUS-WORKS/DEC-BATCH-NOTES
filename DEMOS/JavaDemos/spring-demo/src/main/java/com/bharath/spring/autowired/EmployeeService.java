package com.bharath.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "empService")
public class EmployeeService {
	// @Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		System.out.println("service cnstructor with params called");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeService() {
		System.out.println("service constructor called");
	}

	public void service() {
		System.out.println("service impl");
		employeeRepository.repository();

	}

}
