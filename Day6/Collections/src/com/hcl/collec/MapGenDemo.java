package com.hcl.collec;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new Hashtable<Integer,String>();
		m.put(1, "Priya");
		m.put(2, "Jaanu");
		m.put(3, "Hema");
		m.put(4, "Anisha");
		m.put(5, "Bindu");
		
		int Key;
		String result;
		System.out.println("Enter key");
		Scanner sc = new Scanner(System.in);
		Key = sc.nextInt();
		result = m.getOrDefault(Key, "Not Found");
				System.out.println(result);
		
	}

}
