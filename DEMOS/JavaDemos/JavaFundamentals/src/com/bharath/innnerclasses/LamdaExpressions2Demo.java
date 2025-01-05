package com.bharath.innnerclasses;

interface FI5 {
	int m1(int a, int b, int c);

}

interface FI6 {
	int m1(int a, float b, String c);

}

public class LamdaExpressions2Demo {
	public static void main(String[] args) {
		FI5 fi5 = (int a, int b, int c) -> {
			return a + b + c;
		};
		// FI5 fi5optimise = (int a, b, int c) -> a + b + c;//CE

		FI5 fi5optimise = (int a, int b, int c) -> a + b + c;
		FI5 fi5optimise2 = (a, b, c) -> a + b + c;

		FI6 fi6 = (a,  b,  c) -> {
			//
			//
			//
			//
			//
			return 10;
		};
	}
}
