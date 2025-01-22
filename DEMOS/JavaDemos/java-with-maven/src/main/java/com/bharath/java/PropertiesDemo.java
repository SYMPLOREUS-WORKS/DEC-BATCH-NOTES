package com.bharath.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			File file = new File(
					"G:\\MyWorks\\ONLINE_CONTENT\\Dec-Us-fullstack-training\\DEC-BATCH-NOTES\\DEMOS\\JavaDemos\\java-with-maven\\src\\main\\resources\\demo.properties");
			FileInputStream fis = new FileInputStream(file);

			properties.load(fis);
			String urlFromProperties = properties.getProperty("URL");
			System.out.println("url " + urlFromProperties);
			String URL = urlFromProperties;

			String usernameFromProperties = properties.getProperty("USERNAME");
			System.out.println("username " + usernameFromProperties);
			String USERNAME = usernameFromProperties;

			String passwordFromProperties = properties.getProperty("PASSWORD");
			System.out.println("password " + passwordFromProperties);
			String PASSWORD = passwordFromProperties;

			DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connection established successfully");
			System.out.println(
					"full name " + properties.getProperty("firstname") + " " + properties.getProperty("lastname"));
			System.out.println("not declared property "+properties.getProperty("JAVA"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}