package com.bharath.oops;

class Parent {
}

class Child extends Parent {
}

public class OverloadingWrtParentAndChildAsParam1 {
	public void m1(Parent p) {
		System.out.println("parent method");
	}

	public void m1(Child c) {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();

		OverloadingWrtParentAndChildAsParam1 o = new OverloadingWrtParentAndChildAsParam1();
		o.m1(p);
		o.m1(c);
		o.m1(p1);
		o.m1(null);

	}

}
