package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
			//System.out.println("Connected");
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("Select * from Emp");
			while(rs.next()) {
				System.out.println("Employ No " +rs.getInt("empno"));
				System.out.println("Employ Name " +rs.getString("Ename"));
				System.out.println("Employ Salary " +rs.getInt("sal"));
				System.out.println("Employ Job " +rs.getString("job"));
				System.out.println("Employ mgr " +rs.getInt("mgr"));
				System.out.println("Employ HireDate " +rs.getString("hiredate"));
				System.out.println("EmployDepartment No " +rs.getInt("Deptno"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		}



