package com.bharath.oops;

abstract class Parent4 {
	public abstract void m1();
}

class Child4 extends Parent4 {
	public void m1() {

		System.out.println("child class m1 method");
	}
}

public class OverridingWrtModifier2 {

	public static void main(String[] args) {

		Parent4 p = new Child4();
		p.m1();

	}

}
