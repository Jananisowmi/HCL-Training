package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List lstNames = new ArrayList();
		lstNames.add("Jaanu");
		lstNames.add("Anisha");
		lstNames.add("Hema");
		lstNames.add("Priya");
		lstNames.add("Bindu");
		lstNames.add("Jehanat");
		System.out.println("names are ");
//		for (Object object : lstNames) {
//			System.out.println(object);
//		}
		System.out.println("JDK 1.8");
		lstNames.forEach(System.out::println);
       /* Edit */
		lstNames.set(2, "Jaanu velu");
		System.out.println("list after update");
		lstNames.forEach(System.out::println);
		System.out.println("list after removing by index");
		lstNames.remove(1);
		lstNames.forEach(System.out::println);
		lstNames.remove("Hema");
		System.out.println("list after removing by object");
		lstNames.forEach(System.out::println);
		System.out.println("4th element" +lstNames.get(3));
		
	
}

}
