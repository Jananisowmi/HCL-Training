package com.hcl.boxing;

public class Quiz1 {
	
	public void show(Object x) {
		System.out.println("object" +x);
	}
    
	public void show(int x) {
		System.out.println("int" +x);
	}
	
	public static void main(String[] args) {
		new Quiz1().show("true");
	}
}
