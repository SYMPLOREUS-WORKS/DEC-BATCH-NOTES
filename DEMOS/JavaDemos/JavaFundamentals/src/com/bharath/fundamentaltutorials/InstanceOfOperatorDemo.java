package com.bharath.fundamentaltutorials;

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {

		Object[] o = { new String(), new StringBuilder(), new StringBuffer(), new Thread(), new Vehicle(),
				new Student() };

		Object o1 = o[0];
//		String s1 = (String) o1;

		if (o1 instanceof Integer) {
			System.out.println("it is int instace");
			String s1 = (String) o1;
		}
	 if (o1 instanceof String s) {
			System.out.println("it is string instace");
			//String s1 = (String) o1;
			System.out.println(s.length());
		}
	 
	 
	 System.out.println("braking if else syntax");
		else
			System.out.println("its not a strig instance");

	}

}
