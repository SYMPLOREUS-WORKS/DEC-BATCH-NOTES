package com.bharath.functionalprogramming;

import java.util.function.Consumer;

//interface Consumer<T> {
//	void accept(T t);
//}

public class ConsumerFIDemo {

	public static void main(String[] args) {
		Consumer<String> c = s -> {
			System.out.println(s);
			// return null;
		};
		 c.accept("String");
	}

}
