package com.jaanu.samples.java8;

public class WithLambdaExpression {
	public static void main(String[] args) {
		MyInterface myInterface=() -> { System.out.println("Welcome Lambda"); };
		myInterface.sayMessage();	
	}

}
