package com.bharath.oops;

class ParentClass {

	int a;
	String b;

	public ParentClass() {
		super();
		System.out.println("parent class param less constructor");
	}

	public ParentClass(int a) {
		super();
		System.out.println("parent class constructor");
		this.a = a;
	}
}

public class ConstructorsDemo extends ParentClass {

	private Integer rollNo;
	private String name;

	public ConstructorsDemo(Integer rollNo, String name) {
		this(name);
		// super();

		this.name = name;
		this.rollNo = rollNo;
	}

	public ConstructorsDemo() {
		super();
		// this();
		System.out.println("paramter less constructor");

	}

	public ConstructorsDemo(String name2) {
		System.out.println("dummy constructor");
	}

	public static void main(String[] args) {

		ConstructorsDemo cd1 = new ConstructorsDemo();
		System.out.println(cd1.name + " " + cd1.rollNo);
		cd1.name = "doremon";
		cd1.rollNo = 1;
		System.out.println(cd1.name + " " + cd1.rollNo);

		ConstructorsDemo cd2 = new ConstructorsDemo(2, "pokeman");
		System.out.println(cd2.name + " " + cd2.rollNo);
	}

}
// if we dont add any constructor to class then compiler will add default constructor

//if we add any constructor then compiler will not add any constructor 
//use of constructor is to intialise the variable wrt to each object
//this and super