package com.hcl.quiz;
 

public class Quiz4 {
	public static void main(String[] args) {
		Object[] arr=new Object[]
				{
						12,"Welcome",12.5,"HCL","Java",true,11,11.5,
						"Coimbatore" };
		for (Object object :arr) {
			if(object instanceof Integer ){
				System.out.println(object);
				
			}
		
			if(object instanceof String) {
				System.out.println(object);
			}

	}
	}
}


	


