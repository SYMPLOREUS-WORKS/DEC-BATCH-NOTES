package com.bharath.exceptionhandling;

public class ProductNotFoundException extends Exception {

	public ProductNotFoundException(String exceptionMesage) {
		super(exceptionMesage);
	}

}
