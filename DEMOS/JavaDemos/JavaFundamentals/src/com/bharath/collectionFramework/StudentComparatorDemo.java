package com.bharath.collectionFramework;

import java.util.Comparator;

public class StudentComparatorDemo implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {

		int l1 = o1.getStdName().length();
		int l2 = o2.getStdName().length();

		return l1 > l2 ? +6 : (l1 < l2) ? -9 : o1.getStdName().compareTo(o2.getStdName());
		// return 0;

	}
}
