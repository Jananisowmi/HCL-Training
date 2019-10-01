package com.hcl.collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaProduct {
public static void main(String[] args) {
	List<Product> list = new ArrayList<Product>();
	
list.add(new Product(1,"HP",25000));
list.add(new Product(2,"LP",26000));
list.add(new Product(3,"DELL",27000));

Collections.sort( list,(p1,p2) -> {
	return p1.name.compareTo(p2.name);
});
for (Product product : list) {
System.out.println(product);	
}

Collections.sort(list,(p1,p2) -> {
	return(int) (p1.price-p2.price);
});
System.out.println("Sort by price wise");
System.out.println("-----------");

for (Product product : list) {
	System.out.println(product);
}
	
}
}
