package com.jehanat;

import java.rmi.RemoteException;



public class MainApplication {
	public static void main(String[] args) {
	String result;
		JehanatProxy jaanuProxy=new JehanatProxy();
		try {
			result=jaanuProxy.getName();
			System.out.println("Jehanat Details: "+result);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
