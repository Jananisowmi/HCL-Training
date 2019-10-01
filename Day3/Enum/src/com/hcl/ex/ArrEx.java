package com.hcl.ex;

public class ArrEx {
	public static void main(String[] args) {
		int[] a=new int[] {12,5};
		try {
			
			a[6]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array size is small");
		} catch(ArithmeticException e) {
			System.out.println("Division by zero impossible");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
