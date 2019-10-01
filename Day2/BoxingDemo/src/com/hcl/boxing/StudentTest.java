package com.hcl.boxing;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=1;
		s1.name="Yash";
		s1.city="Cbe";
		
		Student s2=new Student();
		s2.sno=2;
		s2.name="Virat";
		s2.city="Cbe";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
	}

}


