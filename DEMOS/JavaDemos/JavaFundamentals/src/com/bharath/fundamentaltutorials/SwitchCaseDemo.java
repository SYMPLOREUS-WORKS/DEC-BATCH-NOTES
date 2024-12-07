package com.bharath.fundamentaltutorials;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		int a = 2;
		switch (a) {
		
		case 1.0: {

			System.out.println(1);
			break;

		}
		case 2: {
			System.out.println(2);
			break;
		}
		case 10: {
			System.out.println(10);
			break;
		}
		default: {
			System.out.println("no int available");
			break;
		}
		}
		

	}

}
