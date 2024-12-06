package com.bharath.fundamentaltutorials;

public class ArraysDemo {

	public static void main(String[] args) {
		// syntax:
		// datatype [] variableName=new datatype[int size];
		int[] rollNos = new int[5];
		// indices are the numbers which aalocated to each memory bloc of an array
		// always indices are less thn 1 of the size
		// size should be int literal

		// disadvantages
		// 1 we need to allocate memory initially itself
		// we can only same datatype which we intialise an array
		System.out.println("rollNos[0] " + rollNos[0]);
		rollNos[0] = 1;
		rollNos[1] = 2;

		System.out.println("rollNos[0] " + rollNos[0]);
		System.out.println("rollNos[1] " + rollNos[1]);
		System.out.println("rollNos[2] " + rollNos[2]);
		System.out.println("rollNos[3] " + rollNos[3]);
		System.out.println("rollNos[4] " + rollNos[4]);
		// System.out.println("rollNos[5] " + rollNos[5]);

		String[] args1 = new String[10];
		args1[1] = "bharath";
		System.out.println(args1[9]);
		boolean[] bol = new boolean[10];

		Object[] o = new Object[10];
		o[1] = new Thread();
		o[2] = new String();
		o[3] = new StringBuilder();

		// multi imensional arrays
		int[][] rollNoAndSubjectMarks = new int[4][4];

		int[] student1Marks = rollNoAndSubjectMarks[0];
		System.out.println(student1Marks);
		int s1s1 = student1Marks[0];
		s1s1 = 20;
		System.out.println(s1s1);

		int[][] rollNoAndSupplySubjectMarks = new int[3][];
		System.out.println(rollNoAndSupplySubjectMarks[0]);

		rollNoAndSupplySubjectMarks[0] = new int[2];
		rollNoAndSupplySubjectMarks[0][0] = 20;

		rollNoAndSupplySubjectMarks[2] = new int[3];
		rollNoAndSupplySubjectMarks[2][1] = 40;

		rollNoAndSupplySubjectMarks[1] = new int[2];
		// rollNoAndSupplySubjectMarks[1][3] = 20;
		// AIOUBE

		int length = rollNoAndSupplySubjectMarks[1].length;
		System.out.println("rollNoAndSupplySubjectMarks[1] " + length);
		// length

		int[] arr;
		arr = new int['c'];
		System.out.println(arr.length);

		int[] anonymoysArray = new int[] { 1, 2, 3 };
		String[] args2 = new String[] {};
	}

}
