package com.hcl.collec;

import java.util.ArrayList;
import java.util.List;

public class GenStudent {
	public static void main(String[] args) {
		List<Student> lstStudent = new ArrayList<Student>();
		lstStudent.add(new Student("anu", "priya", "cbe", 9));
		lstStudent.add(new Student("janu", "bindu", "banglore", 8));
		lstStudent.add(new Student("anisha", "hema", "pondi", 7));
		System.out.println("Student List");
		lstStudent.forEach(System.out::println);
	}

}
