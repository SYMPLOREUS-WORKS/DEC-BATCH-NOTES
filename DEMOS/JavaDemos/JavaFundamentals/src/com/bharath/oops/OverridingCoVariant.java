package com.bharath.oops;

class Parent1 {
	public Object m1(int a) {
		System.out.println("parent method");
		return null;
	}
}

class Child1 extends Parent1 {
	public String m1(int b) {
		System.out.println("child method");
		return null;
	}
}

public class OverridingCoVariant {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		Child1 c = new Child1();
		Parent1 p1 = new Child1();

		p.m1(0);
		p1.m1(0);

	}

}