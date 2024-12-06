package com.bharath.fundamentaltutorials;


// jvm starts
//loads the class into method area
//creates a main thread simultaneosuly a main stack memory will be created in the stack area
//jvm calls main main method


public class ClassDemo {
	
	
	// datamembers
	// blocks
	// methods
	// instance and static

	int a; // variable
	static int b;// field
	{
	}
	static {
	}

	public void m1() {
		int a1 = 10;
		ClassDemo cd2=new ClassDemo();
		cd2.a=40;
		System.out.println(a1);
		System.out.println("inside m1 " + a);
		System.out.println("this is m1 method");
	}

	public static void m2() {
		System.out.println("this is m2 method");
	}

	public static void main(String[] args) {
		
		Integer[][] ii= new Integer[2][2];
		System.out.println(ii[0][0]);
		
		FirstProgram fp = new FirstProgram();

		// classname reference name= new classname();
		
		ClassDemo classDemo = new ClassDemo();
		classDemo.a = 20;
		System.out.println("line 33 inside main " + classDemo.a);
		classDemo.m1();

		int local = 10;
		
		ClassDemo.b=50;
		
		ClassDemo.m2();
	}

}
