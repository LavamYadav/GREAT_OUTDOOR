package com.capgemini.go.dto;

public class OrderProductMapDTO {
	String orderID;
	String productID;
	String productUIN;
	int productStatus;
	int giftStatus;

	public OrderProductMapDTO(String orderID, String productID, String productUIN, int productStatus, int giftStatus) {
		super();
		this.orderID = orderID;
		this.productID = productID;
		this.productUIN = productUIN;
		this.productStatus = productStatus;
		this.giftStatus = giftStatus;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductUIN() {
		return productUIN;
	}

	public void setProductUIN(String productUIN) {
		this.productUIN = productUIN;
	}

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public int getGiftStatus() {
		return giftStatus;
	}

	public void setGiftStatus(int giftStatus) {
		this.giftStatus = giftStatus;
	}

}
