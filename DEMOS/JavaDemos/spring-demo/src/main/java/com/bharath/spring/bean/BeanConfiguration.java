package com.bharath.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanConfiguration {

	public void m1() {
		System.out.println("m1 called");
	}

	@Bean(value="ctrl")
	@Scope("prototype")
	public Controller controller() {
		System.out.println("controller() called");
		return new Controller();
	}

	@Bean
	public Service service() {
		System.out.println("service() called");
		return new Service();

	}

	@Bean
	public Repository repository() {
		System.out.println("repo() called");
		return new Repository();
	}
	
}
