package com.bharath.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 10, 4, 6, 1, 1, 7, 9, 5, 1, 4, 8, 8, 2, 6, 9, 4);
		System.out.println(list);

		Optional<Integer> optionalInt = list.stream().sorted()
				// .forEach(System.out::print);
				// .min(Integer::compareTo);
				.min((x, y) -> -x.compareTo(y));
		if (optionalInt.isPresent())
			System.out.println(optionalInt.get());

		list.stream().skip(3).forEach(System.out::print);

		List<Integer> newInteger = list.stream().skip(3).limit(5).map(i -> i * i).collect(Collectors.toList());
		System.out.println("newInteger ->"+newInteger);

	}

}
