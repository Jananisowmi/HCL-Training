package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MultipleJson {
	public static void main(String[] args) {
		JSONObject obj=new JSONObject(); 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
		JSONArray arr = new JSONArray(); 
	    System.out.println("enter name");
	    arr.add(sc.nextLine());
	    System.out.println("enter the salary");
	    arr.add(sc.nextLine());
	    System.out.println("enter the email");
	    arr.add(sc.nextLine());
	    obj.put(i,arr);
			 
		 }
		System.out.println(obj);

	}

}
