package com.hcl.ex;

public class Div {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division" +c);
		}
	
		catch(ArithmeticException e) {
			System.out.println("Division by zero impossible");
		}
		catch(NumberFormatException e) {
			System.out.println("string format is impossible");
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arguments are mandatory");
		}
		catch (Exception e) {
             e.printStackTrace();
             
		}finally {
			System.out.println("Program by HCL participants");
			
		}
	}

}
