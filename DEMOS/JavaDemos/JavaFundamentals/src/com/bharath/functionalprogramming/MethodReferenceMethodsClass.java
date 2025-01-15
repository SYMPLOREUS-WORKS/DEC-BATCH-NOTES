package com.bharath.functionalprogramming;

public class MethodReferenceMethodsClass {
	private int a;
	private int b;

	public MethodReferenceMethodsClass(int a) {
		super();
		this.a = a;
		this.b = b;
		//System.out.println("this is dummy constructor to demonstrate constructor reference demo");
	}
	public MethodReferenceMethodsClass(int a,int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(a+b);
		System.out.println("this is dummy constructor to demonstrate constructor reference demo");
	}
	public MethodReferenceMethodsClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	// boolean searchChar(String a, char b);
	public static boolean m1(String s, char ch) {
		char[] charAr = s.toCharArray();
		for (char c : charAr) {
			if (c == ch)
				return true;
		}

		return false;
	}

	public static void m1() {
	}

	public void m2() {
		System.out.println("dummy impl of m2 for instace method reference demo");
	}

}
