package com.hcl.collec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LamdaEmploy {
	public static void main(String[] args) {
		List<Employ>list = new ArrayList<Employ>();
		
		list.add(new Employ(1,"jaanu",253));
		list.add(new Employ(2,"jaa",268));
		list.add(new Employ(3,"aj",378));
		
////		Collections.sort( list,(p1,p2) -> {
//			return p1.name.compareTo(p2.name);
//		});
//		for (Employ employ : list) {
//			System.out.println(employ);	
//			}
//
//			Collections.sort(list,(p1,p2) -> {
//				return(int) (p1.empno-p2.empno);
//			});
//			System.out.println("Sort by empno wise");
//			System.out.println("-----------");
//
//			for (Employ employ : list) {
//				System.out.println(employ);
//	}
		
		 list.stream().filter(p -> p.basic >= 250).forEach(x -> {
				System.out.println(x);
			   });
			   System.out.println("Names starts with j");
			   list.stream().filter(p -> p.name.startsWith("j")).forEach(x -> {
				System.out.println(x);
			});
	}
}

