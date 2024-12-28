package com.bharath.collectionFramework;

public class ComparableDemo {

	public static void main(String[] args) {
		String s1 = "bharaTh";
		String s2 = "bharatH";
		System.out.println(s1.compareTo(s2));
		System.out.println("apple".compareTo("banana"));
		System.out.println("apple".compareTo("Banana"));
		System.out.println("apple".compareTo("apple"));

	}

}
