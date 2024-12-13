package com.bharath.oops;

class Parent {
	final public void asset() {
		System.out.println("have a own house and buy land");
	}

	final public void marriage() {
		System.out.println("I will find a good girl/boy from a descent family who will gtake care of you");
	}

	final public void education() {
		System.out.println("go to schood ,have good friends get good grades so you can have a good job");
	}
}

class Child extends Parent {
//	public void marriage() {
//		System.out
//				.println("I wil find my own boy or a girl I dont care about their families I can take core of myself");
//	}
//
//	public void education() {
//		System.out.println("I dont want to get good grades i just want enjoy my 4 years So i can have loat of fun");
//	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Child child = new Child();
		child.asset();
		child.education();
		child.marriage();

	}

}
