package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptInsert {
	public static void main(String[] args) {
		int deptno;
		String dname,loc;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter dept no");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("name of dept");
		dname=sc.nextLine();
		System.out.println("location");
		loc=sc.nextLine();
		
		String cmd="insert into Dept values(?,?,?)";
		Connection con =DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, deptno);
		pst.setString(2, dname);
		pst.setString(3,loc);
		
		pst.executeUpdate();
		System.out.println("**Record inserted**");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
		
	}

}



