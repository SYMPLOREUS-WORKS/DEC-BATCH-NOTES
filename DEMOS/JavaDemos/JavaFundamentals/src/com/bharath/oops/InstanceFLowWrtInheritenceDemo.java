package com.bharath.oops;

class ParentInstance {
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}

	public ParentInstance() {
		System.out.println("parent constructor");
	}
}

class ChildInstance extends ParentInstance {
	{
		System.out.println("child instance block 1");
	}
	{
		System.out.println("child instance block 2");
	}

	public ChildInstance() {
		super();
		System.out.println("child constructor");
	}
}

public class InstanceFLowWrtInheritenceDemo {
	public static void main(String[] args) {
		//ParentInstance parentInstance= new ParentInstance();
		ChildInstance childInstance = new ChildInstance();
	}
}
