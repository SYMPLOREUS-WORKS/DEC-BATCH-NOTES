package com.bharath.fundamentaltutorials;

import static java.lang.System.out;

import static java.lang.Math.max;

public class StaticImportDemo {
	public static void main(String[] args) {
		out.print("bharath");

		Math.max(10, 20);

	}

	static void max(int a, int b) {
		System.out.println("newly added max method");
	}
}
//explicit
//same package
//implicit