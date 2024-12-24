package com.bharath.java.langpackage;

public class StringEqualityDemo {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		String o = new String(s);
		System.out.println(s == o);
		System.out.println(s1 == s);
		String o2 = new String("Abc");
		System.out.println(o == o2);

		System.out.println(o.equals(o2));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(o.hashCode());
		System.out.println(o2.hashCode());
	}

}
