package com.bharath.oops;

class Parent8 {
	private void m1() {
		System.out.println("parent class");
	}
}

class Child8 extends Parent8 {
	private void m1() {
		System.out.println("child class");
	}
}

public class OveridingWrtModifier4 {

	public static void main(String[] args) {
		Parent8 p = new Parent8();
		Child8 c = new Child8();
		Parent8 p8 = new Child8();
		p.m1();
		c.m1();
		p8.m1();

	}

}
