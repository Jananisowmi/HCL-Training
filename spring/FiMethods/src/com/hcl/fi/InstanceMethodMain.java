package com.hcl.fi;

public class InstanceMethodMain {
	public static void main(String[] args) {
		
		InstanceInterface instanceInterface=() -> {System.out.println("Janu");};
		instanceInterface.myInterface();
		
		InstanceMethodInterface m2=new InstanceMethodInterface();
		instanceInterface =m2::saySomething;
		instanceInterface.myInterface();
		}

}