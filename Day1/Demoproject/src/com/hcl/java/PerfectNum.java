package com.hcl.java;

public class PerfectNum {
	
	public void check(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println("perfect no..");
		} else {
			System.out.println("Npt perfect...");
		}
	}
public static void main(String[] args) {
	int n=28;
	new PerfectNum().check(n);
}
}
