package com.hcl.boxing;

public class StudentSearch {
	
	public Student showStudent(int sno) {
		
	Student student=null;
	if(sno==1) {
		student=new Student();
		student.sno=100;
		student.name="Anubhav";
		student.city="cbe";
	}
		
		if(sno==3) {
			student=new Student();
			student.sno=103;
			student.name="Prem Reddy";
			student.city="banglore";
	}
		return student;
	
	}
	public static void main(String[] args) {
		StudentSearch objSearch=new StudentSearch();
		Student res=objSearch.showStudent(3);
		if(res!=null) {
			System.out.println(res);
		} else {
			System.out.println( "sno Not Found..");
		}
		}
	}



