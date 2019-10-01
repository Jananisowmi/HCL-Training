package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add(new Emp(1,"Hema",12345));
		s.add(new Emp(2,"Janani",21345));
		s.add(new Emp(3,"Kohli",98765));
		s.add(new Emp(4,"Sowmi",65437));
		s.add(new Emp(5,"Bindu",87654));
		System.out.println("Sorted Data");
		s.forEach(System.out::println);
	}
		
	
	
	
	
	}


