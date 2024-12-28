package com.bharath.collectionFramework;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class StackAndVectorDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		Enumeration<Integer> enumeration = stack.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
		/**
		 * Vector class legacy
		 * 
		 * */
		
		
		Vector<String> vector=new Vector<String>();
		vector.add("s1");
		vector.add("s2");
		vector.add("s3");
		
		
		vector.get(0);
		
		vector.set(0, null);
		
		vector.remove(0);

	}

}
