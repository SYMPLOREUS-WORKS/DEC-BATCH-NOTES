package com.bharath.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "application.properties")
@ComponentScan
public class PropertiesLoadingDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PropertiesLoadingDemo.class);
		Environment environment = context.getEnvironment();
		String name = environment.getProperty("firstname");
		System.out.println("name " + name);
		DummyJDBCConfig dummyJDBCConfig = context.getBean(DummyJDBCConfig.class);
		dummyJDBCConfig.connectToDB();

	}

}
