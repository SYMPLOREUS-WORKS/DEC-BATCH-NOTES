package com.bharath.functionalprogramming;

import java.util.function.Predicate;

//interface Predicate<T> {
//	boolean test(T t);
//}

class Student11 {
	Integer age;
	String name;

	public Student11(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}

public class PredicateFIDemo {

	public static void main(String[] args) {

		Predicate<Student11> p = (Student11 std) -> std.age >= 18;

		Student11 std = new Student11(18, "Jack");

//		boolean b = p.test(std);
//		System.out.println(b);
		if(p.test(std)) {
			System.out.println(std.name +" elgible for vote");
		}
		else
			System.out.println(std.name +" not elgible for vote");
	}

}
