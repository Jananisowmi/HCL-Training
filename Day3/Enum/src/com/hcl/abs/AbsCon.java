package com.hcl.abs;

abstract class Employ {
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	
}
 class Janani extends Employ {

public Janani(int empno, String name, double basic) {
		super(empno, name, basic);
		
	}
 }
 
 class Raghu extends Employ {

public Raghu(int empno, String name, double basic) {
		super(empno, name, basic);
	
	}
 }

public class AbsCon {
	public static void main(String[] args) {
		Employ obj1=new Janani(1,"Janani" ,12345);
		Employ obj2=new Raghu(2,"Raghu",54321);
		
		Employ[] arrEmploy=new Employ []{obj1,obj2};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
			
		}
	}

}
