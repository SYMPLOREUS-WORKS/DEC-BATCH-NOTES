package com.bharath.billgenerator.exception;



public class ItemAlreadyAddedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemAlreadyAddedException(String exceptionMessage) {
		super(exceptionMessage);
	}

}
