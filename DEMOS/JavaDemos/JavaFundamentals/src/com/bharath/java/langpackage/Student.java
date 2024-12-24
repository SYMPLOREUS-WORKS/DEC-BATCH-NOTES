package com.bharath.java.langpackage;

public class Student {
	private int rollno;
	private String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public String toString() {
		return String.format("Student {rollNo :%d ,name :%s}", this.rollno, this.name);
	}

	public int hashCode() {
		return this.rollno * 3 * 5;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Student s) {
			return s.rollno == this.rollno && s.name.equals(this.name);

		}
		return false;
	}

	public static void main(String[] args) {
		Student s = new Student(1, "John1");
		Student s1 = new Student(2, "John2");
		Student s2 = new Student(2, "John2");
		System.out.println("toString " + s.toString());
		System.out.println("hashcode " + s.hashCode());
		System.out.println("hashcode " + s1.hashCode());

		System.out.println("equals " + s2.equals(s1));

	}

}
