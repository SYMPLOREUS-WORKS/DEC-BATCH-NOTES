package com.bharath.functionalprogramming;

interface FI1  {
	void m1();
}

interface FI2 {
	void m2(int a);
}

interface FI3 {
	int m3();
}

interface FI4 {
	int m4(int a);
}

class DummyClass implements FI1, FI2, FI3, FI4 {
	@Override
	public void m1() {
		System.out.println("m1 method");

	}

	@Override
	public void m2(int a) {
		System.out.println("m2 method");

	}

	@Override
	public int m3() {
		System.out.println("m3 method");
		return 10;
	}

	@Override
	public int m4(int a) {

		System.out.println("m4 method");
		return 20;
	}

}

public class LamdaExpressionDemo {

	public static void main(String[] args) {

		int a1 = 10;
		FI1 fi1 = () -> {
			// a1=20;
			System.out.println("m1 method");
		};

		FI1 fi1optimise = () -> System.out.println("m1 method");

		FI2 fi2 = (int a) -> {
			System.out.println("m2 method");
		};
		FI2 fi2optmise = (a) -> System.out.println("m2 method");
		
		
		FI2 fi2optmise2 = a -> System.out.println("m2 method");

		FI3 fi3 = () -> {
			System.out.println("m3 method");
			return 10;
		};
		FI3 fi32 = () -> {

			return 10;
		};
		FI3 fi32optimise = () -> 10;// if lamda expression is having only 1 line that to return statement then no
									// nned to have curly braces as well as return

		FI4 fi4 = (int a) -> {
			System.out.println("m4 method");
			return 20;
		};
		FI4 fi42 = (int a) -> {

			return 20;
		};

		FI4 fi42optimise = a ->20;

	}

}
