package com.bharath.java.langpackage;

public class WrapperClasses {

	public static void main(String[] args) {
		// Integer i = new Integer(10);
		// Class c= Class.forName("");

		Integer i = Integer.valueOf(10);
		Integer is = Integer.valueOf("-10");
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 1000;
		Integer i4 = 1000;

		int p1 = 1000;
		int p2 = 1000;
		System.out.println(p1 == p2);
		System.out.println(i == i1);
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println("is value " + is);

	}

}
