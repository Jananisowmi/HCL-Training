package com.jaanu.samples.java8;

public class WithLambdaExpression1 {
	public static void main(String[] args) {
		MyInterface1 myInterface=(var1, var2) -> (var1 + var2);
		int result1=myInterface.addTwoNumbers(10,20);
		System.out.println(result1);
		
		MyInterface1 myInterface2=(var1,var2)-> {return(var1+var2);};
		int result2=myInterface2.addTwoNumbers(30,40);
		System.out.println(result2);
	}

}
