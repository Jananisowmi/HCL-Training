package com.jaanu.samples.java8;

public class WithoutLambdaExpression {
	public static void main(String[] args) {
		MyInterface myInterface=new MyInterface() {
			@Override
			public void sayMessage() {
				System.out.println("Welcome");
			}
			
		};
		myInterface.sayMessage();
	}

}
