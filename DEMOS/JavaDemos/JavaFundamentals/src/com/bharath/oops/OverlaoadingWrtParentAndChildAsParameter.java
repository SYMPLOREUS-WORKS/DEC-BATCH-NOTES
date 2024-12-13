package com.bharath.oops;

public class OverlaoadingWrtParentAndChildAsParameter {
	public void m1(Number a) {
		System.out.println("Number class method");
	}

	public void m1(Integer a) {
		System.out.println("Integer class method");
	}

	public static void main(String[] args) {
		Number a = new Integer(1);
		Integer i = new Integer(10);
		OverlaoadingWrtParentAndChildAsParameter o = new OverlaoadingWrtParentAndChildAsParameter();
		o.m1(a);
		o.m1(i);
		o.m1(null);

	}

}
