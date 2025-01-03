package com.bharath.collectionFramework;

import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		Queue<Integer> intq = new ArrayDeque<Integer>();
//storing
		intq.offer(1);
		intq.offer(2);
		intq.offer(3);
		System.out.println(intq);
		// rerievein
		// elemetn peek

		System.out.println(intq.element());
		System.out.println(intq.peek());

		// remove
		// remove poll
		System.out.println(intq.remove());
		System.out.println(intq.poll());
		System.out.println(intq.poll());

		System.out.println("empty queue calling poll " + intq.poll());
		System.out.println("empty queue calling peek " + intq.peek());
		//System.out.println("empty queue calling elemet " + intq.element());
		//System.out.println("empty queue calling remove " + intq.remove());

		System.out.println("all methods");
		int count = 0;
		for (Method m : intq.getClass().getDeclaredMethods()) {
			System.out.println(++count + " : " + m);
		}

	}
}
