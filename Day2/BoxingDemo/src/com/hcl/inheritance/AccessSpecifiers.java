package com.hcl.inheritance;
class C1 {
	
	public void show() {
		System.out.println("show method");
	}
}

class C2 extends C1 {
}

class C3 {
	protected void show() {
		System.out.println("show method");
	}
}


public class AccessSpecifiers {
	public static void main(String[] args) {
		C1 obj=new C1();
		C2 obj=new C2();
		C3 obj=new C3();
		obj.show();
		obj.display();
		obj.show();
	}

}
