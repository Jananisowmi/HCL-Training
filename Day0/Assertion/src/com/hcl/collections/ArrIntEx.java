package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List num = new ArrayList();
		num.add(new Integer(44));
		num.add(new Integer(11));
		num.add(new Integer(22));
		num.add(new Integer(33));
		num.add(new Integer(55));
		num.add(new Integer(66));
		int sum = 0;
		for (Object ob : num) {
			sum+=(Integer)ob;
			
		}
		System.out.println("sum" +sum);
	}

}
