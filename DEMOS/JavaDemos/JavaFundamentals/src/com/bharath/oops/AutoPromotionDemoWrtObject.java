package com.bharath.oops;

public class AutoPromotionDemoWrtObject {

	public void m1(CharSequence ch) {
		System.out.println("Char sequence method");
	}

	public void m1(Number n) {
		System.out.println("number method");
	}

	public static void main(String[] args) {
		Integer i = 10;
		Number n = 10;
		String s = "abc";
		CharSequence ch = "abc";

		AutoPromotionDemoWrtObject a = new AutoPromotionDemoWrtObject();
		a.m1(ch);
		a.m1(n);
		a.m1(i);
		a.m1(s);
	}

}
