package com.jaanu.samples.java8;

public class MultiInterfaceClass {
	public static void main(String[] args) {
		MultiInterface multiInterface=(name)->( name + " World ");
		System.out.println(multiInterface.sayHello("Jaanu"));
		
		System.out.println(MultiInterface.add(1, 2));
		
		System.out.println(multiInterface.defaultMethod(10));
		
		MultiInterface multiInterface1=(name) -> (name="World");
		System.out.println(multiInterface.equals(multiInterface1));
		
		
		

}
}
