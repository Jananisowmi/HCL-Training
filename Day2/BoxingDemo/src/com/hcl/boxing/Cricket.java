package com.hcl.boxing;

public class Cricket {
	static int score;
	public void incr(int x) {
	score+=x;
	}
	public static void main(String[] args) {
		Cricket Virat=new Cricket();
		Cricket Rohit=new Cricket();
		Cricket Dhoni=new Cricket();
		
		Virat.incr(100);
		Rohit.incr(99);
		Dhoni.incr(50);
		
		System.out.println(Cricket.score);
		
		
		
		
	}
}
	


	
