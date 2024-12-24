package com.bharath.exceptionhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
	private String prodName;
	private Integer quantity;

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product(String prodName, Integer quantity) {
		super();
		this.prodName = prodName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", quantity=" + quantity + "]";
	}

}

public class CustomisedExceptionDemo {

	public static void main(String[] args) throws ProductNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product name : ");
		String prodName = sc.next();
		Product pd1 = getProductFromDB(prodName);
		if (pd1 == null) {
			throw new ProductNotFoundException("product not avaiable with name :" + prodName);
			//System.out.println("after throw keyword");
		} 

			
			
		
		System.out.println(pd1.toString());

	}

	private static Product getProductFromDB(String prodName) {

		Map<String, Product> products = new HashMap<String, Product>();
		products.put("LAPTOP", new Product("Laptop", 1000));
		products.put("SHIRT", new Product("shirt", 500));
		products.put("SHOE", new Product("Shoes", 1000));
		products.put("BELT", new Product("belt", 500));

		return products.get(prodName.toUpperCase());

	}

}
