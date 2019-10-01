package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestCase {
	
	@Test
	public void testplaceOrder() {
		Connection con=DaoConnection.getConnection();
		int orderid=0;
		String cmd="select case when max(orderid) is null then 1"
				+ " else max(orderid)+1 "
				+ "end orderid from orders";
		
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			orderid=rs.getInt("orderid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			assertEquals(orderid, StockBAL.generateOrderidBal());
	 			
	 			
		
			
	}
	
	
	
	@Test
	public void testaddStock() {
		Stock objStock=new Stock();
		String stockid=StockBAL.generateStockBal();
		objStock.setStockId(stockid);
		objStock.setItemName("Laptop");
		objStock.setPrice(50000);
		objStock.setQuantityAvail(2);
		assertEquals("Stock created successfully",StockBAL.addStockBal(objStock));
	}
	
	
	
	@Test
	public void testPlace() {
		assertEquals("Order Placed Successfully...", StockBAL.placeOrderBal("S002", 1));
        assertEquals("Insufficent Quantity...", StockBAL.placeOrderBal("S003",43));
        assertEquals("StockID not found...", StockBAL.placeOrderBal("A001",5));
	
	}
	
	
	@Test
	public void testSearchStock() {
		assertNotNull(StockBAL.searchStockBal("S001"));
		assertNull(StockBAL.searchStockBal("A001"));
	}
	
	
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	
	
	@Test
	public void testgenerateStock() {
		
	   
	    String stid=null;
	    Connection con=DaoConnection.getConnection();
		String cmd="select max(stockId) sid from stock";
		
		
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
			String formated=String.format("%03d",id);
		    stid="S"+formated;
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			assertEquals(stid, StockBAL.generateStockBal());
			
			
	}

	
	@Test
	public void testGettersAndSetters() {
		Stock objStock=new Stock();
		objStock.setStockId("S001");
		objStock.setItemName("Laptop");
		objStock.setPrice(50000);
		objStock.setQuantityAvail(5);
		
		assertEquals("S001", objStock.getStockId());
		assertEquals("Laptop", objStock.getItemName());
		assertEquals(50000, objStock.getPrice());
		assertEquals(5, objStock.getQuantityAvail());
		
	
	
	}
	
}

