package com.hcl.collec;

import java.util.Comparator;

public class StudComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.city.compareTo(o2.city);
	}
	
	}


