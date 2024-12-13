package com.bharath.oops;

public class OverloadingWrtVarArgs {

	public void m1(int... a) {
		System.out.println("var-args method");
	}

	public void m1(int a) {
		System.out.println("primitive method");
	}

	public static void main(String[] args) {
		OverloadingWrtVarArgs o = new OverloadingWrtVarArgs();
		o.m1(1);

	}

}
