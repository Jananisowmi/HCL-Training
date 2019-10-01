package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
public static void main(String[] args) {
	SortedSet s = new TreeSet();
	s.add("Vinod");
	s.add("Janani");
	s.add("Anisha");
	s.add("Virat");
	s.add("puppy");
	s.add("Sowmi");
System.out.println("Sorted Data");
	
	s.forEach(System.out::println);
	
}
}
