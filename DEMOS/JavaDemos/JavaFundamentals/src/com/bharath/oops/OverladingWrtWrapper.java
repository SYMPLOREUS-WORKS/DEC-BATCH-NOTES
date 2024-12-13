package com.bharath.oops;

public class OverladingWrtWrapper {
	public void m1(Integer a) {
		System.out.println("wrapper method");
	}

	public void m1(int a) {
		System.out.println("primitive method");
	}

	public static void main(String[] args) {
		OverladingWrtWrapper o = new OverladingWrtWrapper();
		o.m1(1);

	}

}
