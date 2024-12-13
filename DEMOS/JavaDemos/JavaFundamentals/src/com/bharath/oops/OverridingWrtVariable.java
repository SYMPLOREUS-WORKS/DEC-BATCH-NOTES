package com.bharath.oops;

class Parent9 {
	int x = 10;
}

class Child9 extends Parent9 {
	int x = 50;
}

public class OverridingWrtVariable {

	public static void main(String[] args) {
		Child9 c = new Child9();
		Parent9 p = new Child9();
		System.out.println(c.x + p.x);
	}

}
