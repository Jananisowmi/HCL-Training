package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		String StockId=StockBAL.generateStockBal();
		String ItemName;
		int price,QuantityAvail;
		Stock objStock=new Stock();
		objStock.setStockId(StockId);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Itemname");
		objStock.setItemName(sc.nextLine());
		System.out.println("enter the price");
		objStock.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("enter the quantityAvail");
		objStock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		System.out.println(StockBAL.addStockBal(objStock));
		
		
	}
   
		
		
		
	
	}
	



