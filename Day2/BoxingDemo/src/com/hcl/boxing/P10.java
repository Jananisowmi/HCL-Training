package com.hcl.boxing;

public class P10 {
	public static void main(String[] args) {
		int i=5;
		int j=0;
		j=i++ + 1;
		System.out.println(i);
		System.out.println(j);
		 
		i=1;
		j=0;
		 j=++i + 1;
		 System.out.println();
		 System.out.println(j);
		 System.out.println(i);
	}

}
