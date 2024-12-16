package com.bharath.oops;

class Parent10 {
	static int x = 10;

	public void m1() {
		x++;
	}
}

class Child10 extends Parent10 {
	static int x = 50;

	public void m1() {
		x++;
	}
}

public class OverridingWrtVaraibales2 {

	public static void main(String[] args) {
		Parent10 p = new Parent10();
		System.out.println(p.x);
		p.m1();
		System.out.println(p.x);

		Parent10 p2 = new Parent10();
		System.out.println(p2.x);
		Child10 c = new Child10();

		System.out.println(c.x);

		c.m1();

		System.out.println(c.x);

		Child10 c2 = new Child10();

		System.out.println(c2.x);

	}

}
