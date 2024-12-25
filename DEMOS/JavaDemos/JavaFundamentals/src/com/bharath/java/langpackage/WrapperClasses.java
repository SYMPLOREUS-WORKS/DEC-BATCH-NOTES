package com.bharath.java.langpackage;

public class WrapperClasses {

	public static void main(String[] args) {
		Integer ii = new Integer(10);
		Integer iii = new Integer(10);
		System.out.println(ii == iii);
		// Class c= Class.forName("");
		Integer i = Integer.valueOf(10);
		Integer is = Integer.valueOf("10");
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println("toString " + i.toString());
		int p1 = 1000;
		int p2 = 1000;
		System.out.println((Integer.valueOf(127) == Integer.valueOf(127)));
		System.out.println(p1 == p2);
		System.out.println(i == i1);
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println("is value " + is);
		System.out.println(i == is);
		// wrappe to primitive conversion

		// intvalue float value double
		int primitive = i.intValue();
		i.byteValue();
		i.shortValue();
		i.longValue();
		i.floatValue();
		i.doubleValue();

		Boolean bol = Boolean.valueOf(false);
		Boolean bol2 = Boolean.valueOf("true");
		Boolean bol3 = Boolean.valueOf("false");
		Boolean bol4 = Boolean.valueOf("True");
		Boolean bol5 = Boolean.valueOf("Yes");
		Boolean bol6 = Boolean.valueOf("Wrongs");
		System.out.println(bol);
		System.out.println(bol2);
		System.out.println(bol);
		System.out.println(bol3);
		System.out.println(bol4);
		System.out.println(bol5);
		System.out.println(bol6);

		bol.booleanValue();

		Character c = Character.valueOf('c');
		c.charValue();

		String prim = String.valueOf(10);
		System.out.println("primitve to String " + prim.isEmpty());

		// conversion from string to primitive
		// parseInt parseDouble parseChar
		String randomString = "abc";
		int a = Integer.parseInt(randomString);
		double d = Double.parseDouble(randomString);

		System.out.println("a " + a);
		System.out.println("d " + d);

		// AUtoboxing and AutoUnboxing

		Integer autoboxing = Integer.valueOf(10);
		Integer autoboxing1 = 10;

		int unboxing = autoboxing;// autoboxing.intVAlue();

		double d22 = autoboxing;// doubleValue()

		// Long l = 10;//Inter
		// Double dd = 10;

	}

}
