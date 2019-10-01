package com.hcl.collec;

import java.util.ArrayList;
import java.util.List;

public class LamdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "iphone", 78000));
		list.add(new Product(2, "samsung", 58000));
		list.add(new Product(3, "lenovo", 48000));
		list.add(new Product(4, "Redmi", 28000));
	
   list.stream().filter(p -> p.price >= 30000).forEach(x -> {
	System.out.println(x);
   });
   System.out.println("Names starts with s");
   list.stream().filter(p -> p.name.startsWith("s")).forEach(x -> {
	System.out.println(x);
});


Product maxP=list.stream().max((p1,p2)-> p1.price >= p2.price ?1:-1).get();
System.out.println("Max price record");
System.out.println(maxP);

Product minP=list.stream().min((p1,p2)-> p1.price >= p2.price ?1:-1).get();
System.out.println("Min price record");
System.out.println(minP);



	}
}
