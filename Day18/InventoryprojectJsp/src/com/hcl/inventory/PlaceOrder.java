package com.hcl.inventory;



public class PlaceOrder {
	private String stockId;
	private int quantityOrdered;
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String placeOrderStock(){ 
		return StockBAL.placeOrderBal(stockId, quantityOrdered);
		
}
}
