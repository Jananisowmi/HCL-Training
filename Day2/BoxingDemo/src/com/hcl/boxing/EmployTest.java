package com.hcl.boxing;

public class EmployTest {
	
	public static void main(String[] args) {
		Employ e1=new Employ();
		e1.empno=1;
		e1.name="Yash";
		e1.basic=12345;
		
		Employ e2=new Employ();
		e2.empno=2;
		e2.name="Virat";
		e2.basic=54321;
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		
	}

}
