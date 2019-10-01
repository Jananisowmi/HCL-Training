package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployDelete {
	public static void main(String[] args) {
		int empno,basic;
		String desig;
		System.out.println("enter empno");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		String cmd="delete from employ where empno=?";
		Connection con = DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.executeUpdate();
		System.out.println("Record deleted");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
