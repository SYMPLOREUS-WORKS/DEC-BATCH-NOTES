package com.bharath.java.langpackage;

import java.lang.reflect.Method;


public class ObjectClassMethodsDemo implements Cloneable {

	public static void main(String[] args) throws Throwable {

		ObjectClassMethodsDemo o = new ObjectClassMethodsDemo();
		ObjectClassMethodsDemo o1 = new ObjectClassMethodsDemo();

		Class c = o.getClass();
		String name = c.getName();
		System.out.println(name);
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		// hashcode method
		System.out.println("hascode of o " + o.hashCode());
		System.out.println("hascode of o1 " + o1.hashCode());
		// tostring()
		// string object of corresponding object will be using using to string method
		System.out.println("string rep o " + o.toString());
		System.out.println("string rep o" + o);

		// equals
		Student s1 = new Student(1, "John");
		Student s2 = new Student(1, "John");
		System.out.print("s1==s2 ");
		System.out.println(s1 == s2);
		System.out.println("s1.equals(s2) ");
		System.out.println(s1.equals(s2));

		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.print("str1==str2 ");
		System.out.println(str1 == str2);
		System.out.println("str1.equals(str2) ");
		System.out.println(str1.equals(str2));

		Object ob = new Object();
		o.finalize();
		// finalise()
		// clone
		ObjectClassMethodsDemo o2 = (ObjectClassMethodsDemo) o.clone();

	}

	public static void m1() {
	}

}