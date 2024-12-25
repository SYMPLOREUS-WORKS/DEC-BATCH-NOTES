package com.bharath.java.langpackage;

public class AutoBoxingDemo {
	private int a;
	private int aa;
	private Integer aaa;

	public static void main(String[] args) {
		AutoBoxingDemo auto = new AutoBoxingDemo();
		int b = auto.a;
		Integer bb = auto.aa;
		Integer bbb = auto.aaa;
		int wrapperToPrimitive = auto.aaa;
		System.out.println(b);
		System.out.println("bb " + bb);
		System.out.println("bbb " + bbb);
		System.out.println(wrapperToPrimitive);

	}

}
