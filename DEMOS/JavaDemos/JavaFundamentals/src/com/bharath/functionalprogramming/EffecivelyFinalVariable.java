package com.bharath.functionalprogramming;

interface I4 {
	void m1();
}

public class EffecivelyFinalVariable {

	public static void main(String[] args) {
		int a = 20;

		I4 i4 = () -> {
			//a = 500;
			System.out.println(a);
		};
		System.out.println(a);
	}

}
