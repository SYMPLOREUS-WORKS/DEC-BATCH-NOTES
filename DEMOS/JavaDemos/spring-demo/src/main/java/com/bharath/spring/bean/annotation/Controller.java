package com.bharath.spring.bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Controller {

	public Controller() {
		System.out.println("controller constructor");
	}

	public void controller() {
		System.out.println("controller impl");
	}
}
