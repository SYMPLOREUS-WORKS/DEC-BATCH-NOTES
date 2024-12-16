package com.bharath.oops;

class ParentStatic {
//identification of static blocks from parent to child and intialisation
	// execution of static blocks from parent to child and top to button
	// execution of main method only child class(case I am runnig only child class)
	static int a;
	static {
		System.out.println("parent class static block 1");
	}
	static {
		System.out.println("parent class static block 2");
	}

	public static void m1() {
		System.out.println("parent class m1");
	}

	public static void main(String[] args) {
		System.out.println("paret class main method");
	}
}

class ChildStatic extends ParentStatic {
	static int a;
	static {
		System.out.println("child class static block 1");
	}
	static {
		System.out.println("child class static block 2");
	}

	public static void main(String[] args) {
		System.out.println("child class main metho");
		// System.out.println(a);
	}
}

public class StaticFlowWrtInheritanceDemo {
	public static void main(String[] args) {
		// ParentStatic parentStatic= new ParentStatic();
//	ParentStatic parentStatic2= new ParentStatic();
		ChildStatic childStatic = new ChildStatic();
		ChildStatic.m1();
	}
}
