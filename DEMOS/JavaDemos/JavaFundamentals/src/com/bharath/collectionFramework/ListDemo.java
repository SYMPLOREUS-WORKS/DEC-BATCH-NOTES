package com.bharath.collectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// List<String> l1 = new ArrayList<>();
		Collection<String> collection = new ArrayDeque<String>();
		collection.add("bharath");
		collection.add("raghu");
		collection.add("ajinkya");
		collection.add("manish");

		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {
			// iterator.remove();
			System.out.println(iterator.next());

		}

		// System.exit(0);
		List<String> l1 = new ArrayList<>(collection);
		l1.add(new String());

		// access elements get method
		/**
		 * Iterator and list iteratr
		 * 
		 */

		ListIterator<String> listIterator = l1.listIterator();
		System.out.println("list iterator");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
//			
		}
		System.out.println("revering");

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.exit(0);
		System.out.println(l1.get(0));

		// update set

		l1.set(0, "sharath");

		System.out.println(l1.get(0));

		l1.remove(0);

		System.out.println(l1.get(0));

		/**
		 * linked list
		 */
		System.out.println("linked list operations");
		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("bharath");

		linkedlist.add("bharath");
		linkedlist.add("raghu");
		linkedlist.add("ajinkya");
		linkedlist.add("manish");

		System.out.println(linkedlist.get(2));

		linkedlist.set(4, "reddy");

	}

}
