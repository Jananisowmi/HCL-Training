package com.hcl.inheritance;

class First {
	static {
		System.out.println("Base class Static");
	}
	public First() {
		System.out.println("base class constructor");
	}
}

class Second extends First {
	static {
		System.out.println("derived calss static");
	}
	public Second() {
		System.out.println("Derived class constructor");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new Second();

public class InhDemo {
	public static void main(String[] args) {
		C2 obj=new C2();
		obj.show();
		obj.display();
	}

}
