package com.bharath.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// LocalDAte
		// LOcalTime
		// LOcalDateTime

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date2 = LocalDate.of(1999, 9, 13);
		System.out.println(date2);

		LocalDate date3 = LocalDate.of(1999, Month.SEPTEMBER, 13);
		System.out.println(date3);
		String dateString = "13/09/1999";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate specificFormat = LocalDate.parse(dateString, format);
		System.out.println("sf " + specificFormat);

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);

		long age = ChronoUnit.YEARS.between(date2, date);
		System.out.println(age);

		System.out.println(date2.isBefore(LocalDate.now()));
		;

	}

}
