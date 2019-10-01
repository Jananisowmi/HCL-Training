
package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
public static void main(String[] args) {
	List lstEmploy = new ArrayList();
	lstEmploy.add(new Employ(1, "Janani", 12345));
	lstEmploy.add(new Employ(2, "sai", 54321));
	lstEmploy.add(new Employ(3, "virat", 23456));
	lstEmploy.add(new Employ(4, "Kohli", 65432));
	lstEmploy.add(new Employ(5, "Sam", 78906));
	lstEmploy.add(new Employ(6, "surya", 99876));
	for (Object ob : lstEmploy) {
		Employ e = (Employ)ob;
		System.out.println(e);
	
	}
	
}
}
