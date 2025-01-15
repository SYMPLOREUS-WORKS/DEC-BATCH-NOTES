package com.bharath.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCreationDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();

		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		Stream<Integer> intStream = list.stream();

		Function<Integer, Integer> modify = a -> {
			System.out.println("intermediate operation : " + a);
			return (a * a);
		};

		Stream<Integer> squareStream = intStream.map(modify);

		Consumer<Integer> terminal = i -> {
			System.out.println("terminal operation " + i);
			System.out.println(i);
		};

		// squareStream.close();
		squareStream.forEach(terminal);

		// squareStream.forEach(terminal);
		intStream = list.stream();

		List<String> intTOString= intStream.map(x -> x.toString()).collect(Collectors.toList());
		System.out.println(intTOString);
	}

}
