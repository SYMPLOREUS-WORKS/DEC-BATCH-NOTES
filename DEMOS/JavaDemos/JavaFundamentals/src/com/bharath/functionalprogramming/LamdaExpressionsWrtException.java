package com.bharath.functionalprogramming;

interface FI {

	void m1() throws Exception;
}

public class LamdaExpressionsWrtException {

	public static void main(String[] args) throws Exception {

		FI fi = () -> {
			System.out.println("m1 method");
			throw new Exception("exception with lamdas");
		};
		fi.m1();

	}
}
