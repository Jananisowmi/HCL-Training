package com.hcl.project;

import java.util.List;

import java.util.Scanner;

public class CustomerMain {
	
	public static void deleteCustomer() {
		int custId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustId  ");
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		String res=obj.deleteCustomerBal(custId);
		System.out.println(res);
	}
	public static void updateCustomer() {
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter custId  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Student AnnualPremium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter modalPremium ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter paymentPremium");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		String res=obj.updateCustomerBal(objCustomer);
		System.out.println(res);
	}
	public static void showCustomer() {
		CustomerBAL obj=new CustomerBAL();
		List<Customer> lstCustomer=obj.showCustomerBal();
	for (Customer customer : lstCustomer) {
			System.out.println(customer);
		}
	}
	public static void searchCustomer() {
		int custId;
		System.out.println("Enter Customer custId ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL(); 
		Customer objCustomer=obj.searchCustomerBal(custId);
		if(objCustomer!=null) {
			System.out.println(objCustomer);
		} else {
			System.out.println("Record not found...");
		}
		
	}
	
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	
	
	public static void addCustomer() {
		
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer custId  ");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer custName  ");
		objCustomer.setCustName(sc.nextLine());
		System.out.println("Enter Student AnnualPremium  ");
		objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter ModalPremium  ");
		objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter PayMentMode");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
		CustomerBAL obj=new CustomerBAL();
		try {
			boolean res=obj.addCustomerBal(objCustomer);
			if(res==true) {
				System.out.println("Customer Record Added");
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("---------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4. Update Customer");
			System.out.println("5. Delete Customer");
			System.out.println("6. Write Student File");
			System.out.println("7. Read Student File");
			System.out.println("8. Exit");
			System.out.println("Enter Ur Choice  ");
			ch=sc.nextInt();
			switch(ch) {
			case 1 : 
				addCustomer();
				break;
			case 2 :
				showCustomer();
				break;
			case 3 :
				searchCustomer();
				break;
			case 4 : 
				updateCustomer();
				break;
			case 5 : 
				deleteCustomer();
			case 6 : 
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile();
				break;
			case 8 : 
				return;
			default : 
				System.out.println("Invalid Choice");
			}
		} while(ch!=8);
	}

                                                


}

