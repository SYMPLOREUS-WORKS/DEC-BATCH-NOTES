package com.bharath.oops;

interface Interf3 {
	void m1();
}
interface Interf4 {
	void m1(int a);
}
public class OverridingWrtInterface2 implements Interf3, Interf4 {
	public void m1(int a) {
		System.out.println("int param ");
	}
	public void m1() {
		System.out.println("no parameter");
	}
	public static void main(String[] args) {
		OverridingWrtInterface2 i1 = new OverridingWrtInterface2();
		i1.m1();
		i1.m1(10);
	}
}
