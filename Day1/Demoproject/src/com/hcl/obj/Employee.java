package com.hcl.obj;

public class Employee {
	int empno;
	String name;
	double basic;
	
	public Employee[] showEmployee() {
		Employee[] arrEmployee=new Employee[3];
		
		arrEmployee[0]=new Employee();
		arrEmployee[0].empno=1;
		arrEmployee[0].name="Janai";
		arrEmployee[0].basic=12345;
		
		arrEmployee[1]=new Employee();
		arrEmployee[1].empno=2;
		arrEmployee[1].name="Sowmiya";
		arrEmployee[1].basic=67890;
		
		arrEmployee[2]=new Employee();
		arrEmployee[2].empno=3;
		arrEmployee[2].name="Baby";
		arrEmployee[2].basic=98765;
		
		return arrEmployee;
	}
	public static void main(String[] args) {
		Employee[] result=new Employee().showEmployee();
		for (Employee e : result) {
			System.out.println(e.empno + " "+ e.name +  " " +e.basic);
			
		}
		
	}
	}


