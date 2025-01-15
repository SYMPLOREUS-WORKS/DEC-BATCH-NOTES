package com.bharath.functionalprogramming;

interface Manupulate<T> {

	T manipulate(T t);
}

interface StringManupulate<T> {

	String manipulate(String t);
}

public class LamdaExpressionAsMethodParamDemo {

	static void m1(Integer i) {

	}

	static String m1(StringManupulate<String> s, String str) {

		return s.manipulate(str);
	}

	public static void main(String[] args) {
		// StringManupulate<String> s = str -> str.toUpperCase();
		// String result = m1(s, "bharath");
		m1(10);
		String result = m1(str -> str.toUpperCase(), "bharath");
		System.out.println(result);

		StringManupulate<String> s2 = str -> {
			return new StringBuilder(str).reverse().toString();
		};

		String result2 = m1(str -> {

			return new StringBuilder(str).reverse().toString();
		}, "ajinkya");
		System.out.println(result2);
	}

}
