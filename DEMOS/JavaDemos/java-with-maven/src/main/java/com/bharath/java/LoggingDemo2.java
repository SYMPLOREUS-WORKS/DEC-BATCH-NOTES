package com.bharath.java;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo2 {

	final static Logger LOGGER = LoggerFactory.getLogger(LoggingDemo2.class);

	public static void main(String[] args) {

		controller();

	}

	private static void controller() {
		LOGGER.info("controller method called");
		System.out.println("logic of controller");
		service();
		LOGGER.info("controller method complted");
	}

	private static void service() {
		LOGGER.info("service method called");
		System.out.println("service business logic");
		LOGGER.info("calling ms2");
		try {
			ms2m1();
		} catch (Exception e) {
			LOGGER.error("exception occured while calling ms2");
			throw e;
		}
		LOGGER.info("service method completed");
	}

	private static void ms2m1() {
		LOGGER.info("ms2 m1 called");
		System.out.println("msm1 logic");
		try {
			ms3m1();
		} catch (Exception e) {
			LOGGER.error("exception occured while calling ms3");
			throw e;
		}
		LOGGER.info("ms2m1 method completed");
	}

	private static void ms3m1() {
		LOGGER.info("ms3m1 called");
		Random random = new Random();
		int a = random.nextInt(0, 2);
		System.out.println(10 / a);
		LOGGER.info("ms3m1 method completed");
	}

}
