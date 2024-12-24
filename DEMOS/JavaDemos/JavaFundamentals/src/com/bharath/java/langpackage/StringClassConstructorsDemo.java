package com.bharath.java.langpackage;

import java.lang.reflect.Constructor;

public class StringClassConstructorsDemo {

	public static void main(String[] args) {
		String s = "abc";
		Constructor[] arr = s.getClass().getConstructors();
		int count = 0;
		for (Constructor c : arr) {
			System.out.println(++count + " : " + c);
		}
		
		//constructi
		StringBuilder sb= new StringBuilder();
		String s1= new String(sb);
		
		//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
	}

}
