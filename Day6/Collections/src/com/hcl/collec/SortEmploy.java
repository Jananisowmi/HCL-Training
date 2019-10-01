package com.hcl.collec;



import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		Set<Employ> setEmploy = new TreeSet<Employ>(c);
		setEmploy.add(new Employ(1, "Divya", 12345));
		setEmploy.add(new Employ(2, "Abi", 12097));
		setEmploy.add(new Employ(3, "Hams", 12035));
		setEmploy.add(new Employ(4, "Haritha", 12040));
		setEmploy.add(new Employ(5, "Indhu", 12042));
		System.out.println("Employ List");
		setEmploy.forEach(System.out::println);

	}

}
