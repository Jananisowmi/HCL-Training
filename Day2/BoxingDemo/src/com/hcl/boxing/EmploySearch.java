package com.hcl.boxing;


public class EmploySearch {
	
	public Employ showEmploy(int empno) {
		Employ employ=null;
		if(empno==1) {
			employ=new Employ();
			employ.empno=100;
			employ.name="Anubhav";
			employ.basic=12345;
		}
			
			if(empno==3) {
				employ=new Employ();
				employ.empno=103;
				employ.name="Prem Reddy";
				employ.basic=17345;
		}
			return employ;
		}
	
		public static void main(String[] args) {
			EmploySearch objSearch=new EmploySearch();
			Employ res=objSearch.showEmploy(1);
			if(res!=null) {
				System.out.println(res);
			} else {
				System.out.println( "Empno Not Found..");
			}
			}
		}


