package com.bharath.oops;

class Parent2 {

	void m1() {
		System.out.println("parent calss m1 method");
	}
}

class Child2 extends Parent2 {
protected	void m1() {
		System.out.println("child calss m1 method");
	}
}

public class OveridingWrtVisibility {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		Child2 c = new Child2();
		Parent2 p2 = new Child2();
		c.m1();
		p.m1();
		p2.m1();
	}

}
