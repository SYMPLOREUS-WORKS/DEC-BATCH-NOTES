package com.bharath.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {

	public static void main(String[] args) {
		List<Object> list = new ArrayList();

		while (true) {

			list.add(new Object());

		}

	}
}