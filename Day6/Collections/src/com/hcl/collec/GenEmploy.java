package com.hcl.collec;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy = new ArrayList<Employ>();
		lstEmploy.add(new Employ(1, "Divya", 12345));
		lstEmploy.add(new Employ(2, "Abi", 12097));
		lstEmploy.add(new Employ(3, "Hams", 12035));
		lstEmploy.add(new Employ(4, "Haritha", 12040));
		lstEmploy.add(new Employ(5, "Indhu", 12042));
		System.out.println("Employ List");
		lstEmploy.forEach(System.out::println);


	}

}
