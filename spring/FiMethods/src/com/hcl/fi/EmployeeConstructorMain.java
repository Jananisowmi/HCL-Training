package com.hcl.fi;

public class EmployeeConstructorMain {
 public static void main(String[] args) {
//	 EmployeeInterface e=Employee::new;
//	 Employee e1=e.employee(21, "Jaanu");
//	 System.out.println(e1.getEmpNo());
//	 System.out.println(e1.getEmpName());
//	
	 FunctionalInterfaceInt f1=Employee::new;
	 Employee f2=f1.employee(2000);
	 System.out.println(f2.getEmpNo());
	 
	 FunctionInterfaceString f3=Employee::new;
	 Employee f4=f3.employee("Virat");
	 System.out.println(f4.getEmpName());
	 	 
	 
	 
	 
	 
}
 
}
