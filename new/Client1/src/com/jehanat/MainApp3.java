package com.jehanat;

import java.rmi.RemoteException;



public class MainApp3 {
	
	public static void main(String[] args) {
		int result=0;
		SapCodeProxy calculatorProxy=new SapCodeProxy();
		try {
			result=calculatorProxy.getInt();
			System.out.println("Jehanat SapCode: "+result);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
