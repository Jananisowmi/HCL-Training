package com.hcl.employee.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import com.hcl.employee.model.Employee;


public interface EmployeeDao {
	
	
	
	public List<Employee> getAllEmployees();


}
