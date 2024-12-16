package com.bharath.oops;

class ParentInstStatic {

	int a;
	static int b;
	static {
		System.out.println("static block1");
		System.out.println("b " + b);
		b = 10;

	}
	static {
		System.out.println("static block2");
		System.out.println("b " + b);

	}

	{
		System.out.println("instance block 1");

	}
	{
		System.out.println("instance block 2");
	}

	public ParentInstStatic(int a) {
		this();
		this.a = a;
		System.out.println("parent class parameter constructor");
	}

	public ParentInstStatic() {
		super();
		System.out.println("parent class parameter less consructor");

	}
}

class ChildInstStatic extends ParentInstStatic {

	int a1;
	static int b1;
	static {
		System.out.println("child static block1");
		System.out.println("b1 " + b1);
		b1 = 10;

	}
	static {
		System.out.println("child static block2");
		System.out.println("b1 " + b1);

	}

	{
		System.out.println("child instance block 1");

	}
	{
		System.out.println("child instance block 2");
	}

	public ChildInstStatic(int a) {
		this();
		this.a1 = a;
		System.out.println("child class parameter constructor");
	}

	public ChildInstStatic() {
		super();
		System.out.println("child class parameter less consructor");

	}
}

public class StaticAndInstanceFlowWrtInheritenceDemo {
	public static void main(String[] args) {
		// ParentInstStatic parentInstStatic = new ParentInstStatic(1);
		ChildInstStatic childInstStatic = new ChildInstStatic(1);
	}

}
