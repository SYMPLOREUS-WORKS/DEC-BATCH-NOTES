package com.bharath.optionaClass;

import java.util.Optional;

public class OPtionalClassDemo {
	public static void main(String[] args) {
//instanec creation
		Optional<String> optionalString = Optional.of("bharath");
		Optional<String> optionalStringWithNull = Optional.ofNullable(null);

		boolean dataAvailable1 = optionalString.isPresent();
		System.out.println("dataAvailable1 " + dataAvailable1);

		String data = optionalString.get();

		System.out.println(data);
		boolean dataAvailable2 = optionalStringWithNull.isPresent();
		System.out.println("dataAvailable2 " + dataAvailable2);

		Optional<String> or = optionalStringWithNull.or(() -> Optional.ofNullable(new String()));
		String alternate = optionalStringWithNull.orElse("alternate");

		String orelseget = optionalStringWithNull.orElseGet(() -> new String());

	//	optionalStringWithNull.orElseThrow();
		optionalStringWithNull.orElseThrow(() -> new RuntimeException("data is nnot avaiable"));

	}
}
