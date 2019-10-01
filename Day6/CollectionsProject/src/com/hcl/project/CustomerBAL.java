package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	static	StringBuilder sb = new StringBuilder();

	
	
	public boolean addCustomerBal (Customer objCustomer) throws CustomerException {
		boolean isAdded=true;
		
		if(objCustomer.getCustId()<=0) {
		     sb.append("CustomercustId cannot be Negative or Zero \r\n");
		     isAdded=false;
				}

				if(objCustomer.getCustName().length()<= 5) {
					sb.append("Name more than 5 characters \r\n");
					isAdded=false;
				}
		
				if(objCustomer.getAnnualPremium()<=200000 && objCustomer.getAnnualPremium()>=1000000) {
					sb.append("Annual Premium cannot exceed \r\n");
					isAdded=false;
				}
				
				if(objCustomer.getModalPremium()<=1000 && objCustomer.getAnnualPremium()>=50000) {
					sb.append("Modal Premium cannot exceed \r\n");
					isAdded=false;
				}
				
				if(objCustomer.getPaymentMode() <= 0) {
					sb.append("enter the correct payment mode Non Zero \r\n");
					isAdded=false;
				}
				if(objCustomer.getPaymentMode() >= 4) {
					sb.append("enter the correct payment mode Not greater than 3 \r\n");
					isAdded=false;
					
				}
					if(isAdded==false) {
						throw new CustomerException(sb.toString());
					} else {
						new CustomerDAO().addCustomerDao(objCustomer);
					}
                     return isAdded;

					}
			
				
			
	
	
	
				public Customer searchCustomerBal(int sno){
					return new CustomerDAO().searchCustomerDao(sno);
				}
				
				public List<Customer> showCustomerBal() {
					return new CustomerDAO().showCustomerDao();
				}

				
				
				public String deleteCustomerBal(int custId) {
					return new CustomerDAO().deleteCustomerDao(custId);
				}


				public String updateCustomerBal(Customer objCustomer) {
					return null;
				}

				public void writeCustomerFileBal() {
					new CustomerDAO().writeCustomerFileDao();
				}
				
				public void readCustomerFileBal() {
					new CustomerDAO().readCustomerFileDao();
				
				}


					
				
				
				




				}
				
				

	
