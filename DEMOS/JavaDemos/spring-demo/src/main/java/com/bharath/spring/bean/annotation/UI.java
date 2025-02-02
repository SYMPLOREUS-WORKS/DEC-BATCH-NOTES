package com.bharath.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UI {

	public static void main(String[] args) {
		System.out.println("main method start");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		context.getBean(Service.class);
		System.out.println("main method end");
	}

}
