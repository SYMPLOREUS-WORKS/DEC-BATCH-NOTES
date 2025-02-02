package com.bharath.spring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DummyJDBCConfig {

	@Autowired
	private Environment environment;
	
	public void connectToDB() {
		String url= environment.getProperty("URL");
		String username= environment.getProperty("DATA-USERNAME");
		System.out.println("url "+url)
		;
		System.out.println("username "+username);
	}
}
