package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {

	@Override
	public void run() {
		List lstData=new ArrayList();
		lstData.add("Janu");
		lstData.add("Anu");
		lstData.add("Hema");
		lstData.add("Priya");
		lstData.add("Bindu");
		lstData.add("Jamil");
		
		for (Object object : lstData) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
class LinkDemo implements Runnable {

	@Override
	public void run() {
	 LinkedList lst=new LinkedList();
	 lst.add("Amit");
	 lst.add("Yash");
	 lst.add("Sai");
	 lst.add("Kohli");
	 lst.add("Sharma");
	 lst.add("Anubhav");
	 lst.addFirst("Tarun");
	 lst.addLast("Kiruba");
	 for (Object object : lst) {
		 System.out.println("Link List"  +object);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
	}
	
}
class VectorDemo implements Runnable {
	@Override
	public void run() {
	  Vector v=new Vector(3,2);
	  v.addElement("Nivetha");
	  v.addElement("Yashwanth");
	  v.addElement("Sai Krishana");
	  v.addElement("PremReddy");
	  v.addElement("Srikeerthana");
	  v.addElement("NivethaRaj");
	  for (Object object : v) {
		  System.out.println("Vector List" +object);
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	}
}

public class ThrImp {
	public static void main(String[] args) {
		Thread t1=new Thread (new ListDemo());
		Thread t2=new Thread (new LinkDemo());
		Thread t3=new Thread (new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}

}
