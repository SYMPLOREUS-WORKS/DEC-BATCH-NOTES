package com.bharath.exceptionhandling;

public class AbnormalTerminationDemo {

	public static void main(String[] args) {

		System.out.println("main method called");
		String message = m1();
		System.out.println("message from m1 is " + message);
		System.out.println("main method end");
	}

	public static String m1() {
		System.out.println("m1 method called");
		m2();
		System.out.println("returning from m1 method");
		return "m1 method executed successfully";
	}

	private static void m2() {
		System.out.println("m2 method called");
		
		
		System.out.println(10 / 0);// executing thi operation it cannot do the operation so m2 method is
									// responsibel to create an dexcetion object and throw it
//throw new ArithmeticException("/ by zero");
		System.out.println("end of m2 method");

	}
}
