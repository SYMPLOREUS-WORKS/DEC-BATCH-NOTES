package com.bharath.exceptionhandling;

import com.bharath.oops.OverlaoadingWrtParentAndChildAsParameter;

public class PartiallyCheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("tryblock");
		} catch (Exception e) {
			System.out.println("runtime exceptio catch block");
		}
		try {
			// throw new Exception("manually thrown");
		//	throw new OverlaoadingWrtParentAndChildAsParameter();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
