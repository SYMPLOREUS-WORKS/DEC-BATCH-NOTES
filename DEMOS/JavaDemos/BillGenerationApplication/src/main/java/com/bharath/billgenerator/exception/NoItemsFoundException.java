package com.bharath.billgenerator.exception;

public class NoItemsFoundException extends RuntimeException {
	public NoItemsFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
