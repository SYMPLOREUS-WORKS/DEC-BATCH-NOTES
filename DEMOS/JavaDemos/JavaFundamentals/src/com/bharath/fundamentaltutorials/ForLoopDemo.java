package com.bharath.fundamentaltutorials;

public class ForLoopDemo {

	public static void main(String[] args) {
		
//		continue;

		// initialisation
		// condtional check
		// increment section
		for (int i = 0; i < 10; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(i);

			if (i == 6) {
				System.out.println("i values is 6 breaking for loop");
				break;
			}
		
		}

//		for (System.out.println("initioalisatoin"); true; System.out.println("increment section")) {
//			System.out.println("for body");
//		}
	}

}
