package com.bharath.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogginDemo {

	private static final Logger logger = LoggerFactory.getLogger(LogginDemo.class);

	public static void main(String[] args) {
		// Logging messages at various levels
		logger.debug("This is a DEBUG message");
		logger.info("This is an INFO message");
		logger.warn("This is a WARN message");
		logger.error("This is an ERROR message");
		

		// Logging an exception
		try {
			throw new Exception("This is a test exception");
		} catch (Exception e) {
			logger.error("An error occurred: ", e);
		}
	}
}
