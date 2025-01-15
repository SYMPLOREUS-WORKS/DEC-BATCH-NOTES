package com.bharath.functionalprogramming;

interface I3 {
	public void m1(int a, int b);
}

public class ConstructorMethodReferenceDemo {

	public static void main(String[] args) {

		I3 i3 = MethodReferenceMethodsClass::new;
		i3.m1(20, 30);
	}

}
