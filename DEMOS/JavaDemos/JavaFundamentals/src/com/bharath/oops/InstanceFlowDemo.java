package com.bharath.oops;

public class InstanceFlowDemo {
	// identification of instance members from top to buttom same time it will
	// initialise the default values
	// execute the instance blocks from top to buttom
	// execute the constructor

	int a;
	static int b;

//	public void M1() {
//	}
//	InstanceFlowDemo() {-> parameter less constructor
//		System.out.println("constructor");
//	}

	public InstanceFlowDemo() {// default costructor
		System.out.println("constructor");
	}

	{
		System.out.println(a);
		System.out.println("instance block 1");
		System.out.println("a " + a + " b " + b);
	}
	static {
		System.out.println("static block 1");

	}
	{
		//a = 50;
		int a = 10;
		System.out.println("instance block 2");
		System.out.println("expecting instance a " + this.a + " b " + b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("main method begin");
		System.out.println("object creation");
		InstanceFlowDemo id = new InstanceFlowDemo();
		System.out.println("creating anothe object");
		InstanceFlowDemo id2 = new InstanceFlowDemo();
		System.out.println("object created");

		id.a = 100;
		System.out.println("a " + id.a + " b " + id.b);
		System.out.println("a " + id2.a + " b " + id.b);
		id2.a = 1000;
		System.out.println(" wrt id2a " + id.a + " b " + id.b);
		System.out.println("wrt id2a " + id2.a + " b " + id.b);
		System.out.println("main method end");

	}

	{
		//b = 10;
		System.out.println("instance block 4");
		System.out.println("a " + a + " b " + b);
	}
	static {

		System.out.println("static block 2");

	}
	{
		System.out.println("instance block 3");
		System.out.println("a " + a + " b " + b);
	}

}
