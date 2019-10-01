package com.jaanu;

import java.rmi.RemoteException;

public class MainApplication {
	
	public static void main(String[] args) {
		int result=0;
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		try {
			result=calculatorProxy.add(5, 10);
			System.out.println("Add of 2 numbers: "+result);
			result=calculatorProxy.multi(5, 10);
			System.out.println("Multi of 2 numbers: "+result);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
