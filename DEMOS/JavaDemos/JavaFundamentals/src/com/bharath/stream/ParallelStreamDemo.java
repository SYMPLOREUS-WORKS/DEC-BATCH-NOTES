package com.bharath.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("bharath", "ajinkya", "dhara", "manish", "raghu");

		List<String> finalNames = new ArrayList<String>();

		names.parallelStream().map((String name) -> {
			System.out.println("name in map " + name);
			return name.toUpperCase();
		}).forEach((String name) -> {

			System.out.println(name);
			finalNames.add(name);
		}

		);
		System.out.println("final names " + finalNames);
	}

}
