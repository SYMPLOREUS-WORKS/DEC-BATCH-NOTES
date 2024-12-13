package com.bharath.oops;

interface Interf5 {
	default void m1() {
		System.out.println("m1 default method");
	}
}

interface Interf6 {
	default void m2() {
		System.out.println("m2 default method");
	}
}

public class OverridingWrtDefaultMethods implements Interf5, Interf6 {

	public static void main(String[] args) {
		OverridingWrtDefaultMethods o = new OverridingWrtDefaultMethods();
		o.m1();
		o.m2();

	}

}
