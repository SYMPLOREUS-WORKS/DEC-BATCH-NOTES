package com.bharath.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

interface FII<T, R> {
	T m1(R i);
}

//interface Function<T, R> {
//	R apply(T t);
//}

public class FunctionFIDemo {

	public static void main(String[] args) {
		FII<Integer, String> fi = i -> Integer.valueOf(i);

		int result = fi.m1("10");
		System.out.println(result);

		Function<Integer, String> f = i -> i.toString();

		String r = f.apply(20);
		System.out.println(r);

//		Function<Menu, MenuDTO> ff->m->{MenuDTo dto new MENuDTo();
//		dto.set
//		return dto;}

		BiFunction<String, Integer, String> bif = (a, b) -> (a + b);
		
	String s=	bif.apply("One", 1);
	
	System.out.println(s);
	
	
	BinaryOperator<String> bo=(a,b)->(a+b);
	System.out.println(bo.apply("jack ", "ma"));
	
	)
	}

}
