package com.bharath.oops;

class Parent7 {
	public void m1() throws Exception {
		System.out.println("parent class m1 method");
	}
}

class Child7 extends Parent7 {
	public void m1() throws RuntimeException {
		System.out.println("child class m1 method");
	}
}

public class OverridingWrtThrowsKeyword {

	public static void main(String[] args) throws Exception {
		Parent7 p = new Child7();
		p.m1();

	}

}
