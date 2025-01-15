package com.bharath.functionalprogramming;

interface I2 {
	void m1();

}

public class InstanceMethodReferencDemo {

	public static void main(String[] args) {
		MethodReferenceMethodsClass mm = new MethodReferenceMethodsClass();
		I2 i2 = mm::m2;
		i2.m1();
	}
}
