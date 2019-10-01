package com.hcl.java;

public class MaxNum {
	public void check(int a, int b, int c){
		if (a>b&& a>c){
			System.out.println("a is greater");
	} else if (b>a && b>c){
		System.out.println("b is greater");
	} else {
		System.out.println("c is greater");
		}
		
}

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=20;
		MaxNum obj=new MaxNum();
		obj.check(a,b,c);
	
	}}
		
	

