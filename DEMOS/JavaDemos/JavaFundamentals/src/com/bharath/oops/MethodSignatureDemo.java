package com.bharath.oops;

public class MethodSignatureDemo {

	public int m1() {
		System.out.println("m1 method called");
		return 1;
	}

	public void m1() {
		System.out.println("new m1 method called");
	}

	public String m2(String fname) {
		System.out.println("m2 method called");
		return fname.toUpperCase();
	}

	public static void main(String[] args) {
		MethodSignatureDemo msd = new MethodSignatureDemo();
		msd.m1();
		// msd.m2(1); CE
		String result = msd.m2("abc");
		msd.m1();

	}

}
