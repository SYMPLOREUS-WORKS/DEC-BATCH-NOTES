package com.bharath.fundamentaltutorials;

public class LiteralsDemo {

	public static void main(String[] args) {
	int a=1000;// number with base 10
	byte b=100;
	short s=120;
	long l=1245678988888888888l;
	
	int octalForm=0126;// number with base 8 (start with 0 and each digit should be in 0-7 range)
	int hexaDecimalForm=0Xaef;//a number with base 16
	System.out.println("octalForm 0126 "+octalForm);
	System.out.println("hexa form 0Xaef "+hexaDecimalForm);
	float f=010.0F;
	double d=010.0;
	// float octalf=01234.0;
	 float octalf=01234;
	 System.out.println(octalf);
	char c='a';
	//char c1="a";
	//char ch2='ab';
	//byte short int
	//char
	char unicode=0;//0-65535
	System.out.println("unicode 45 "+unicode);
	char hexa='\uafa3';
	char unicode1=0126;
	
	System.out.println("hexa '\\uafa3' "+hexa);

	}

}
