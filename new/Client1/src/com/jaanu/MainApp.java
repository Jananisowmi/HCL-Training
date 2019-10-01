package com.jaanu;

import java.rmi.RemoteException;

import com.bindu.BinduProxy;
import com.jehanat.SapCodeProxy;




public class MainApp {
	public static void main(String[] args) {
		int result=0;
		int result1=0;
		int result2=0;
		
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		BinduProxy binduproxy=new BinduProxy();
		SapCodeProxy jehanatProxy=new SapCodeProxy();
		try {
			result=binduproxy.getInt();
			System.out.println("SapCode of Bindu: "+result);
			result1=jehanatProxy.getInt();
			System.out.println("SapCode of Jehanat: "+result1);
			result2=calculatorProxy.add(result, result1);
			System.out.println("add of SapCodes:" +result2);
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
}
