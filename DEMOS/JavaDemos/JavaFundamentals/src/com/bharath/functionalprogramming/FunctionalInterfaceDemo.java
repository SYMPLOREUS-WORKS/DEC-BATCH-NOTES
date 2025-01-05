package com.bharath.functionalprogramming;



@FunctionalInterface
interface FunctionalInterface1 {

	void m1();

	default void m2() {
		
	}

}

public class FunctionalInterfaceDemo implements FunctionalInterface1 {

	@Override
	public void m1() {
		System.out.println("m1 method normal impl");

	}

	public static void main(String[] args) {
		FunctionalInterface1 fi = new FunctionalInterfaceDemo();

		fi.m1();

		FunctionalInterface1 fiin = new FunctionalInterface1() {

			@Override
			public void m1() {
				System.out.println("m1 method annonmyous inner class impl");
			}

			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}

		};
		fiin.m1();
		FunctionalInterface1 fil = () -> System.out.println("m1 method implementation with lamda expression");
		System.out.println(fil);
		fil.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
