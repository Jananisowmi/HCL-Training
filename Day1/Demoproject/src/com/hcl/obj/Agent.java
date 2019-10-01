package com.hcl.obj;

import com.hcl.java.SbExample1;

public class Agent {
	
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipCode){
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!= 'A'){
			sbError.append("Name starts with A" + "\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')== -1 ) {
			sbError.append("Name Contains space" + "\r\n");
			isValid=false;
		}
		if(maritalStatus!=0 || maritalStatus!=1){
			sbError.append("maritalStatus either 0 or 1" + "\r\n");
			isValid=false;
		}
		if(zipCode.length()>6){
			sbError.append("zipcode contains 6 char" + "\r\n");
			isValid=false;
			
		}
		if(fullName.length()>20){
			sbError.append("fullName cannot cross 20 char" + "\r\n");
		isValid=false;
		}
	
	if(isValid==true) {
		sbError.append("agentId " + agentId);
		sbError.append("fullName " + fullName);
		sbError.append("maritalStatus" + maritalStatus);
		sbError.append("zipCode" + zipCode);
	}
		return sbError;
	}



public static void main(String[] args) {
    String agentId;
    String fullName;
    int maritalStatus;
    String zipCode;
    agentId = "Janu";
    fullName= "Janu velu";
    zipCode= "Java"
    StringBuilder sbRes=
             new SbExample1().show(agentId,fullName,maritalStatus,zipCode);
            System.out.println(sbRes);
    
   