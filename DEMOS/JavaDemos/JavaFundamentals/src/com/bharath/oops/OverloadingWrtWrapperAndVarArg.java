package com.bharath.oops;

public class OverloadingWrtWrapperAndVarArg {
	public void m1(int... a) {
		System.out.println("var-args method");
	}

	public void m1(Integer a) {
		System.out.println("wrapper method");
	}

	public static void main(String[] args) {
		OverloadingWrtWrapperAndVarArg o = new OverloadingWrtWrapperAndVarArg();
		o.m1(0);

	}

}
