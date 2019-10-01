package com.hcl.bank;

import java.util.Scanner;

public class CloseAccountmain {
	
	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter AccountNo..");
		accountNo=sc.nextInt();
		System.out.println(AccountBAL.closeAccountBal(accountNo));
	}

}
