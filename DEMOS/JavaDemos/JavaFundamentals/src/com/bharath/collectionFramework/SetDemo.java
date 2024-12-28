package com.bharath.collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();

		set.add(5);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(2);
		set.add(2);
		System.out.println(set.toString());

		Set<String> stringset = new HashSet<String>();

		stringset.add("zebra");

		stringset.add("apple");
		stringset.add("umbrella");
		stringset.add("lion");

		System.out.println(stringset);
		/**
		 * linked hashset
		 */
		Set<Integer> linkedset = new LinkedHashSet<Integer>();

		linkedset.add(5);
		linkedset.add(1);
		linkedset.add(3);
		linkedset.add(4);
		linkedset.add(2);
		linkedset.add(2);
		System.out.println(linkedset.toString());
		
		linkedset.contains(5);

	}

}
