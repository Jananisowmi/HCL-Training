package com.hcl.collections;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set s = new LinkedHashSet();
	s.add("Vinod");
	s.add("Janani");
	s.add("Anisha");
	s.add("Virat");
	s.add("puppy");
	s.add("Sowmi");
	
	s.add("Vinod");
	s.add("Janani");
	s.add("Anisha");
	s.add("Virat");
	s.add("puppy");
	s.add("Sowmi");
	
	
	s.add("Vinod");
	s.add("Janani");
	s.add("Anisha");
	s.add("Virat");
	s.add("puppy");
	s.add("Sowmi");
	
	s.add("Vinod");
	s.add("Janani");
	s.add("Anisha");
	s.add("Virat");
	s.add("puppy");
	s.add("Sowmi");
	System.out.println("Hashset Data");
	
	s.forEach(System.out::println);
	
	
}
}
