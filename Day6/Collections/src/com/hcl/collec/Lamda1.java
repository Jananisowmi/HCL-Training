package com.hcl.collec;


import java.util.ArrayList;
import java.util.List;

public class Lamda1 {
	public static void main(String[] args) {
		List<Integer> lstData= new ArrayList<Integer>();
		lstData.add(new Integer(42));
		lstData.add(new Integer(11));
		lstData.add(new Integer(22));
		lstData.add(new Integer(33));
		lstData.add(new Integer(44));
		
		int sum;
		lstData.forEach(p-> {
			if(p>=10){
				System.out.println(p);
			}
		});
		
	}

}
