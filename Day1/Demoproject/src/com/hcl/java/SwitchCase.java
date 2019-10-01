package com.hcl.java;

public class SwitchCase {
	
	public void show(int dayNo) {
		
		switch(dayNo) {
		
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wedday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("satday");
			break;
		default:
				System.out.println("invalid value");
		
		}
	}

}
