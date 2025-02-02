package com.bharath.spring.bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Repository {
	public Repository() {
		System.out.println("repo constructor");
	}

}
