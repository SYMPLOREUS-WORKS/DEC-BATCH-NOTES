package com.bharath.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
	// @Autowired
	private EmployeeService employeeService;

	private EmployeeService empService;

	// @Autowired
	public void setEmpService(EmployeeService empService) {
		System.out.println("setEmpService() called");
		this.empService = empService;
	}

	@Autowired
	public EmployeeController(EmployeeService employeeService) {

		System.out.println("parameterises controller constructor called");
		this.employeeService = employeeService;
	}

	public EmployeeController() {
		System.out.println("controller constructor");
	}

	public void controller() {
		System.out.println("controller impl");
		employeeService.service();
		// empService.service();
	}
}
