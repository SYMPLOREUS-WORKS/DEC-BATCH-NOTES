package com.bharath.functionalprogramming;

interface Supplier<T> {
	T get();
}

public class SupplierFIDemo {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			System.out.println("supplier method print");
			return "supplier method";
		};

		String result = s.get();
		System.out.println(result);

	}

}
