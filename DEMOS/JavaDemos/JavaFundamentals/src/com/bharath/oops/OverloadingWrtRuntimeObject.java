package com.bharath.oops;

public class OverloadingWrtRuntimeObject {
	public void m1(String a) {
		System.out.println("String class method");
	}

	public void m1(Integer a) {
		System.out.println("Integer class method");
	}
	public static void main(String[] args) {
		String s= new String();
		CharSequence ch= new String();
		Integer i=10;
		Number n=10;
		OverloadingWrtRuntimeObject o= new OverloadingWrtRuntimeObject();
		o.m1(i);
		o.m1(s);
		o.m1(n);
		o.m1(ch);

	}

}