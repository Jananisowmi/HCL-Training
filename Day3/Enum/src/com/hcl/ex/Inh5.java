package com.hcl.ex;

class Sc3 {
	int a,b;
	public Sc3() {
		a=5;
		b=8;
	}
	@Override
	public String toString() {
		return "C3 [a=" + a + ", b=" + b + "]";
	}
	
}
class Sc2 extends Sc3 {
	public Sc2(int a,int b) {
}
}
public class Inh5 {
 public static void main(String[] args) {
	Sc2 obj=new Sc2(12,5);
	System.out.println(obj);
}
}
