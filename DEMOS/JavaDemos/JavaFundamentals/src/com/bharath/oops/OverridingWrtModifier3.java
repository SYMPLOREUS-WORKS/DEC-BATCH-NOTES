package com.bharath.oops;

class Parent5 {
	public static void m1() {
		System.out.println("parent class m1 method");
	}
}

class Child5 extends Parent5 {
	public static void m1() {
		System.out.println("child class m1 method");
	}

}

public class OverridingWrtModifier3 {

	public static void main(String[] args) {
		Parent5 p = new Parent5();
		Child5 c = new Child5();
		Parent5 p4 = new Child5();

		p.m1();
		c.m1();
		p4.m1();

	}

}
