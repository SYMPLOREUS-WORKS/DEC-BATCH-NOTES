package com.bharath.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	String empName;
	List<PhoneNumber> phneNumbers;

	public Emp(String empName, List<PhoneNumber> phneNumbers) {
		super();
		this.empName = empName;
		this.phneNumbers = phneNumbers;
	}

}

class PhoneNumber {
	String number;
	Character type;

	public PhoneNumber(String number, Character type) {
		super();
		this.number = number;
		this.type = type;
	}
}

public class FlatMapDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp("bharath", List.of(new PhoneNumber("9063388012", '1'), new PhoneNumber("1122334455", '0')));
		Emp e2 = new Emp("ajinkya", List.of(new PhoneNumber("+416 1122 ", '1'), new PhoneNumber("112238855", '0')));
		Emp e3 = new Emp("raghu", List.of(new PhoneNumber("+416 4561 ", '1'), new PhoneNumber("112237855", '0')));
		Emp e4 = new Emp("dhara", List.of(new PhoneNumber("+416 745 ", '1'), new PhoneNumber("89562177", '0')));

		List<Emp> empList = Arrays.asList(e1, e2, e3, e4);

		empList.stream().flatMap(

				employee -> employee.phneNumbers.stream().map(phoneNumber -> phoneNumber.number))
				.map(stringphone -> stringphone.toCharArray()).forEach(ch -> System.out.println(ch));
		//System.out.println(characters);

		char[] ch = { 'a', 'b', 'c' };
		System.out.println(ch);

	}

}
