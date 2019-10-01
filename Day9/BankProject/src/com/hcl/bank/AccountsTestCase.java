package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountsTestCase {
	
	
	@Test
	public void testWithdrawAccount() {
		assertEquals("Amount debited",AccountBAL.withdrawAccountBal(3,3000) );
		assertEquals("Insuffient fund",AccountBAL.withdrawAccountBal(3,300000) );
		assertEquals("Account no not found...",AccountBAL.withdrawAccountBal(-3,300000) );
		assertEquals("Account Closed",AccountBAL.withdrawAccountBal(1,300) );
	}
	
	
	
	@Test
	public void testDepositAccount() {
		assertEquals("Amount credited", AccountBAL.depositAccountBal(3, 3000));
		assertEquals("Account No Not Found", AccountBAL.depositAccountBal(-3, 3000));
		assertEquals("Account Closed..", AccountBAL.depositAccountBal(1, 3000));
	}
	
	
	
	@Test
	public void testCloseAccount() {
		assertEquals("Account Closed..", AccountBAL.closeAccountBal(4));
		assertEquals("Account No Not Found", AccountBAL.closeAccountBal(-4));
	}
	
	
	@Test 
	public void testUpdateAccount(){
		assertEquals("Order Placed Successfully...", AccountBAL.updateAccountBal(2,"Chennai","TN"));
        assertEquals("Account No Not Found", AccountBAL.updateAccountBal(-2,"chennai","TN"));
	    assertEquals("Account Closed Already", AccountBAL.updateAccountBal(1,"chennai","TN"));
	
	
	}
	
	
	
	@Test
	public void testSearchAccount() {
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
	}
	
	
	
	@Test 
	public void testCreateAccount() {
		Accounts objAccounts = new Accounts();
		int accno=AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Bindu");
		objAccounts.setLastName("Sree");
		objAccounts.setCity("Banglore");
		objAccounts.setState("Karnataka");
		objAccounts.setAmount(88222);
		objAccounts.setCheqfacil("Yes");
		objAccounts.setAccountType("Savings");
//		objAccounts.setStatus("active");
		assertEquals("Accounts created successfully",AccountBAL.createAccountBal(objAccounts));
	}

	
	
	
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	
	
	
	
	@Test
	public void testGenerateAccountNo() {
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from Accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
	}
	

	@Test
	public void testGettersAndSetters() {
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Sai");
		objAccounts.setLastName("Krishana");
		objAccounts.setCity("Banglore");
		objAccounts.setState("Karnataka");
		objAccounts.setAmount(88222);
		objAccounts.setCheqfacil("Yes");
		objAccounts.setAccountType("Savings");
		objAccounts.setStatus("active");
		
		assertEquals(1, objAccounts.getAccountNo());
		assertEquals("Sai", objAccounts.getFirstName());
		assertEquals("Krishana", objAccounts.getLastName());
		assertEquals("Banglore",objAccounts.getCity());
		assertEquals("Karnataka", objAccounts.getState());
		assertEquals(88222, objAccounts.getAmount());
		assertEquals("Yes", objAccounts.getCheqfacil());
		assertEquals("Savings", objAccounts.getAccountType());
		assertEquals("active", objAccounts.getStatus());
		
		
		
	}
	
}
