package com.bharath.innnerclasses;

class Outer2 {

	public void m3() {
		System.out.println("m3 method");

	}

	public void m1() {

		int a = 10;

		class MethodLInnerclass {

			public void m2() {
				// a = 20;
				System.out.println(a);
				System.out.println("m2 method ");
			}
		}

		MethodLInnerclass mlic = new MethodLInnerclass();
		System.out.println("mlic " + mlic);
		
		
//		System.out.println("m1 method ");
//		System.out.println(a);
//		mlic.m2();
//
//		System.out.println("other code");
//
//		mlic.m2();
//
//		mlic.m2();
//		System.out.println("other code");
//		System.out.println("other code");
	}

}

public class MethodLocalInnerClassDemo {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.m1();
	}
}
