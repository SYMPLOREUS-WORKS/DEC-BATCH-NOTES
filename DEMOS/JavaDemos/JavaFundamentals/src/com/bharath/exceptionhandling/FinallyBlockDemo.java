package com.bharath.exceptionhandling;

import java.lang.reflect.Constructor;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		System.out.println("main method called");
		m1();
		System.out.println("end of main method");
	}

	private static void m1() {
		System.out.println("m1 method called");
		m2();
		System.out.println("end of m1 method");

	}

	private static void m2() {
		System.out.println("m2 method called");
		try {
			Class cl = Class.forName("java.lang.String123");
//			ClassNotFoundException excep = new ClassNotFoundException("java.lang.String123");
//			excep.fillInStackTrace();
//			throw excep;
			Constructor[] constructors = cl.getConstructors();
			System.out.println(constructors.length);
		} catch (ClassNotFoundException e) {

			System.out.println("catch block");
		} finally {
			System.out.println("finally bock");
		}

	}

}
