package com.hcl.ems;

import java.sql.Date;

public class Employee {
	private int empId;
	private String empName;
	private String empEmailId;
	private String empMobNo;
	private String empDptName;
    private Date d;
	private int empMgrId;
	private int empLeaveBal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public String getEmpDptName() {
		return empDptName;
	}
	public void setEmpDptName(String empDptName) {
		this.empDptName = empDptName;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public int getEmpMgrId() {
		return empMgrId;
	}
	public void setEmpMgrId(int empMgrId) {
		this.empMgrId = empMgrId;
	}
	public int getEmpLeaveBal() {
		return empLeaveBal;
	}
	public void setEmpLeaveBal(int empLeaveBal) {
		this.empLeaveBal = empLeaveBal;
	}
	

	
}
