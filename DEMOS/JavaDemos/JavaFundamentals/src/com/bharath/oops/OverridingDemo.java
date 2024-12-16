package com.bharath.oops;

class ParenT {
	public void asset() {
		System.out.println("have a own house and buy land");
	}

	public void marriage() {
		System.out.println("I will find a good girl/boy from a descent family who will gtake care of you");
	}

	public void education() {
		System.out.println("go to schood ,have good friends get good grades so you can have a good job");
	}
}

class ChilD extends ParenT {
	public void marriage() {
		System.out
				.println("I wil find my own boy or a girl I dont care about their families I can take core of myself");
	}

	public void education() {
		System.out.println("I dont want to get good grades i just want enjoy my 4 years So i can have loat of fun");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

		ParenT p = new ParenT();
		ChilD c= new ChilD();
		ParenT p1= new ChilD();
		//ChilD c1= new ParenT();
	}

}
