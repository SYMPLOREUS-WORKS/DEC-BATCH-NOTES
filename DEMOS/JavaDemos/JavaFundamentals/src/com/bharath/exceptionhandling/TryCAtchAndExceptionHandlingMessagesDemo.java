package com.bharath.exceptionhandling;

public class TryCAtchAndExceptionHandlingMessagesDemo {

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
		try {
			System.out.println("permorming aritmetic operation");
			System.out.println(10 / 0);
			System.out.println("permored aritmetic operation");
		} catch (Exception e) {
			System.out.println("Exception occured in try block");
			// exception handling methods
			// toString
			// printStackTrace
			// getMessage()
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("end of m2 method");

	}
}
