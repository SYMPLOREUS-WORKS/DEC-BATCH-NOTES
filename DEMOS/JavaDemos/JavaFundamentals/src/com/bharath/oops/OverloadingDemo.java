package com.bharath.oops;

public class OverloadingDemo {

	public void m1() {
		System.out.println("this is m1 with no parameter");
	}

	public void m1(int a) {
		System.out.println("this is m1 with parameter");
	}

	public String doPayment(CreditCard card) {
		System.out.println("checked the card details");
		// card.getCardNumber() ;
		// db cards
		System.out.println("validate card details");
		System.out.println("intitating payment gateway");
		System.out.println("authorising payment");
		// sendMessage()

		return "Payment successfull";

	}

	public String doPayment(COD cod) {

		// sendMessage()
		System.out.println("It is cod order collect the payment while delivery");
		return "order placed successfully";

	}

	public static void main(String[] args) {
		OverloadingDemo old = new OverloadingDemo();
		// old.m1(1);
		CreditCard credit = new CreditCard();
		// old.doPayment(credit);

		COD cod = new COD();
		old.doPayment(cod);
	}

}
