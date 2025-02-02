package com.bharath.spring.bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public Service() {
		System.out.println("service constructor called");
	}

}
