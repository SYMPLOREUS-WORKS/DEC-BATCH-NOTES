package com.bharath.stream;


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOpertionsDemo {

	public static void main(String[] args) {

		IntStream integerStream = IntStream.range(1, 100);
		Stream<Integer> stream = integerStream.boxed();

		long count = stream.
				map(integer -> integer.toString()).
				map(string -> Integer.valueOf(string))
				.filter(integer -> integer % 2 == 0)
				// .collect(Collectors.toList());
				.count();
		System.out.println(count);

	}

}
