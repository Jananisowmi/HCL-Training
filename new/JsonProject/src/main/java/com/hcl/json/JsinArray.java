package com.hcl.json;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;  

public class JsinArray {
	
	 
	public static void main(String args[]){    
	  JSONObject obj=new JSONObject(); 
	  for(int i=0;i<3;i++) {
	  JSONArray arr = new JSONArray();  
	  arr.add("janu"+i);     
	  arr.add(1000*i);    
	  arr.add(25+i);
	  obj.put(i,arr);
	  }
	  System.out.println(obj);
	  


}
	}

