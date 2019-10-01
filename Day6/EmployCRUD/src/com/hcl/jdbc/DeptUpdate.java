package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
	public static void main(String[] args) {
		int deptno;
		String dname,loc;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter deptno");
				deptno=sc.nextInt();
				System.out.println("enter dname");
				dname=sc.next();
				System.out.println("enter loc");
				loc=sc.next();
				String cmd="update Dept Set dname=?, loc=? where deptno=?";
				Connection con=DaoConnection.getConnection();
				try {
					PreparedStatement pst= con.prepareStatement(cmd);
				pst.setString(1, dname);
				pst.setString(2, loc);
				pst.setInt(3, deptno);
				pst.executeUpdate();
				System.out.println("*** record updated***");
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}



