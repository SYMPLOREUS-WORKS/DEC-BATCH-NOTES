package com.bharath.oops;

public class AutoPromotionDemo {

	public void m1(int a) {
		System.out.println("int method");
	}
	
	public void m1(float f) {
		System.out.println("float method");
	}
	public static void main(String[] args) {
		AutoPromotionDemo a= new AutoPromotionDemo();
		a.m1(0);
		a.m1(0f);
		a.m1('c');

	}

}
