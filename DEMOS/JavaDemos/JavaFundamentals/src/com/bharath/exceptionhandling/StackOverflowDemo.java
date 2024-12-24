package com.bharath.exceptionhandling;

public class StackOverflowDemo {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		m1();

	}

}
