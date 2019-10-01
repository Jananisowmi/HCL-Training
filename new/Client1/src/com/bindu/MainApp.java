package com.bindu;

import java.rmi.RemoteException;



public class MainApp {
	public static void main(String[] args) {
		int result=0;
		BinduProxy calculatorProxy=new BinduProxy();
		try {
			result=calculatorProxy.getInt();
			System.out.println("Bindu SapCode: "+result);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
