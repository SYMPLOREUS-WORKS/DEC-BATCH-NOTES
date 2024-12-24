package com.bharath.java.langpackage;

import java.lang.reflect.Method;
import java.nio.file.spi.FileSystemProvider;

public class StringMethodsDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class stringClass = Class.forName("java.lang.String");

		Method[] methods = stringClass.getDeclaredMethods();

		int count = 0;
		for (Method m : methods) {
			// System.out.println(++count + " : " + m);
		}
		String s1 = new String("Horry");
		String s2 = new String("Potter");
		s1 = s1.concat(s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s2);

		String s3 = "0123456";
		String s4 = "AAAC";
		String s5 = s3.toLowerCase();
		System.out.println("26 " + s3 == s5);//26 0123456 ==0123456
		String s6 = s4.toLowerCase();
		System.out.println(s5 == s6);
		String s7 = s6.toLowerCase();
		System.out.println(s6 == s7);
		String s8 = s7.toUpperCase();
		String s9 = s5.toUpperCase();
		System.out.println(s8 == s9);

		String subString = s3.substring(1, 7);
		System.out.println(subString);

		System.out.println(s3.length());

		char ch = s3.charAt(3);
		System.out.println(ch);
		int index = s4.indexOf('A');
		System.out.println(index);
		int lindex = s4.lastIndexOf('A');
		System.out.println(lindex);

		// format
		// trim
		// trialleading
		// stripTRailing
		// split
		// matches
		// equals
		// equalsIgnrecase

		String formatUsage = 
"       Hi my name is %s. I teach java tutorials. Today is %d class      ";
		String resultant = String.format(formatUsage, "Bharath", 15);
		System.out.println(resultant);
		String afterTriming = resultant.trim();
		System.out.println(afterTriming);
		System.out.println(resultant.stripLeading());
		System.out.println(resultant.stripTrailing());

		String[] spliting = afterTriming.split(" ");
		for (String s : spliting) {
			System.out.println(s);
		}
		String toMatch = "After sPlIting";
		System.out.println("after spliting".equalsIgnoreCase(toMatch));

	}

}
