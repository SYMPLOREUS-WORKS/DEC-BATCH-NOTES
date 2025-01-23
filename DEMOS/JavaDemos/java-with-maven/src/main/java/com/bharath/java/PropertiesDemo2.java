package com.bharath.java;

import java.io.File;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertiesDemo2 {

	public static void main(String[] args) {
		Configurations config = new Configurations();
		File file = new File(
				"G:\\MyWorks\\ONLINE_CONTENT\\Dec-Us-fullstack-training\\DEC-BATCH-NOTES\\DEMOS\\JavaDemos\\java-with-maven\\src\\main\\resources\\demo.properties");

		PropertiesConfiguration properties = null;
		;

			try {
				properties = config.properties(file);
			} catch (ConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		String url = (String) properties.getProperty("URL");
		System.out.println(url);

	}

}
