package com.bharath.innnerclasses;

import com.bharath.innnerclasses.Outer.Inner2;

class Outer {
	static int a = 10;

	public void m1() {
		System.out.println("outer m1 method");
	}

	static class Inner1 {
		public void m2() {
			System.out.println("static inner m2 method");
		}

	}

	class Inner2 {
		public void m2() {
			System.out.println("normal inner m2 method");
		}

	}
}

public class NormalInnerclassDemo {
	public static void main(String[] args) {

		Outer.a = 20;
		Outer outer = new Outer();
		//outer.m1();
		System.out.println("outer reference " + outer);
		Outer.Inner1 inner1 = new Outer.Inner1();

		//inner1.m2();
		System.out.println("inner1 refernce " + inner1);
		Outer.Inner2 inner2 = outer.new Inner2();
		//inner2.m2();
		System.out.println("inner2 refernce " + inner2);
	}
}
