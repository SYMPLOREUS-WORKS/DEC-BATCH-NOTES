package com.bharath.oops;

public class AutoPromotionAmbiguityDemo {

	public static void m1(int a, float b) {
		System.out.println(a + b);
	}

	public static void m1(float a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		m1(10f, 12);
		m1(4, 5f);
		m1(10, 10);

	}

}
