package com.bharath.oops;

public class OverloadingWrtCommonParameter {
	public void m1(String a) {
		System.out.println("String class method");
	}

	public void m1(Integer a) {
		System.out.println("Integer class method");
	}

	public static void main(String[] args) {
	
OverloadingWrtCommonParameter o= new OverloadingWrtCommonParameter();
o.m1(1);
o.m1("abc");
o.m1(null);
	}

}
