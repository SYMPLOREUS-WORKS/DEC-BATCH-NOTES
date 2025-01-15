package com.bharath.functionalprogramming;

interface I1 {

	boolean searchChar(String a, char b);
}



public class StaticMethodReferencesDemo {

	public static void main(String[] args) {

		I1 i = (str, sheep) -> {
			char[] charAr = str.toCharArray();
			for (char c : charAr) {
				if (c == sheep)
					return true;
			}

			return false;
		};
		System.out.println(i.searchChar("laptop", 'l'));
		
		
		
		I1 i1 = MethodReferenceMethodsClass::m1;
		
		System.out.println(i1.searchChar("laptop", 'c'));
		
		
		

	}

}
