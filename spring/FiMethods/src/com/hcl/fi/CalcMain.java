package com.hcl.fi;

public class CalcMain {
	
 public static void main(String[] args) {
	 Calculator c =new Calculator();
	 Integer ans=c.calc((a, b)-> a+b,10,5);
	 System.out.println(ans);
	 
}


}
