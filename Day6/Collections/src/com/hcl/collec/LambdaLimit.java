package com.hcl.collec;

import java.util.ArrayList;
import java.util.List;

public class LambdaLimit {
public static void main(String[] args) {
	List<Integer> lstData = new ArrayList<Integer>();
	lstData.add(new Integer(11));
	lstData.add(new Integer(22));
	lstData.add(new Integer(33));
	lstData.add(new Integer(55));
	lstData.add(new Integer(16));
	lstData.stream().limit(3).forEach(p -> {
		System.out.println(p);
	});
	
	System.out.println("After Skipping 2 records");
	lstData.stream().skip(2).forEach(p -> {
		System.out.println(p);
	});
	System.out.println("Filter Data");
	lstData.stream().filter(p -> p> 15).forEach(x -> {
		System.out.println(x);
	});
}
}
