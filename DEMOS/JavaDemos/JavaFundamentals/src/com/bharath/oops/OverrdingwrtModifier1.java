package com.bharath.oops;

class Parent3 {
	public strictfp void m1() {
		System.out.println("parent class m1");
	}
}

class Child3 extends Parent3 {
	public void m1() {
		System.out.println("child class m1");
	}
}

public class OverrdingwrtModifier1 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		p.m1();

	}

}
