package com.bharath.exceptionhandling;

public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 0 };
		try {
			System.out.println(arr[3]);
			System.out.println(arr[0] / arr[2]);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
