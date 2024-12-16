package com.bharath.oops;

public class StaticFlowDemo {
//identification of static members from top to buttom same time it will initialise the default values
	// execute the static blocks from top to buttom
	// execute the main method
	int a;
	static int b;
	static String name;

	public static void main(String[] args) {

		System.out.println("main method");
	}

	static {
		
		
		System.out.println("static block 1");
		System.out.println("b " + b + " name " + name);
	}

	static {
		System.out.println("static block 2");
		b = 50;
		System.out.println("b " + b + " name " + name);
	}
	static {
		System.out.println("static block 3");
		name = "doreman";
		System.out.println("b " + b + " name " + name);
	}

	static {
		System.out.println("static block after main");
	}
}
