package com.hcl.collec;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Priya", "Darshini");
		m.put("Laksh", "Laksh");
		m.put("Jaanu", "Sowmi");
		m.put("Anisha", "HCl");
		
		String Key = "Priya";
		String value = (String)m.getOrDefault(Key, "Not Found");
		System.out.println(value);
				
	}

}
