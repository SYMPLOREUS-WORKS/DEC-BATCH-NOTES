package com.bharath.oops;

interface Interf1 {

	void m1();

}

interface Interf2 {
	void m1();
}

public class OverridingWrtInterface implements Interf1, Interf2 {

	public void m1() {
		System.out.println("overidden interf1  mehod");
	}
	public void m1() {
		System.out.println("overidden interf2  mehod");
	}

	public static void main(String[] args) {
		Interf1 i = new OverridingWrtInterface();

		i.m1();
		Interf2 i2 = new OverridingWrtInterface();

		i2.m1();
	}

}
