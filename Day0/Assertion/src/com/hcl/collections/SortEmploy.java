package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c = new  BasicComparator();
		SortedSet s = new TreeSet(c);
		s.add(new Employ(1,"Hema",12345));
		s.add(new Employ(2,"Janani",21345));
		s.add(new Employ(3,"Kohli",98765));
		s.add(new Employ(4,"Sowmi",65437));
		s.add(new Employ(5,"Bindu",87654));
		System.out.println("Sorted Data");
		s.forEach(System.out::println);
	}

}
