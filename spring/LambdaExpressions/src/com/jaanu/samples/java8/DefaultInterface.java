package com.jaanu.samples.java8;

public interface DefaultInterface {
	default void printHello() {
		System.out.println("Hello Default");
	}
	
	static void printJanani() {
		System.out.println("Jaanu");
		
	}

}
