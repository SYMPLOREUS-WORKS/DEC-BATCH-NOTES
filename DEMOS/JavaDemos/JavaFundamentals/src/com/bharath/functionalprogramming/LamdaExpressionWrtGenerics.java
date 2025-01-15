package com.bharath.functionalprogramming;

class Student {
	int roll;
}

interface GetStringFromInteger {
	String toString(Integer i);

}

interface GetStringFromStudent {
	String toString(Student i);

}

interface GetStringFromObject<T> {
	String toString(T t);
}

public class LamdaExpressionWrtGenerics {

	public static void main(String[] args) {
		GetStringFromInteger i = (Integer a) -> a.toString();
		System.out.println(i.toString(20).length());

		GetStringFromStudent std = (Student a) -> a.toString();
		System.out.println(std.toString(new Student()));

		GetStringFromObject<Integer> gi = (Integer a) -> a.toString();
		System.out.println(gi.toString(0));

		GetStringFromObject<Student> gstd = (Student a) -> a.toString();
		System.out.println(std.toString(new Student()));

		GetStringFromObject<Float> floatg = (Float f) -> f.toString();

	}
}
