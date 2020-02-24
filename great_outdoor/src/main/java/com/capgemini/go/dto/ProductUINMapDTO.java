package com.capgemini.go.dto;

public class ProductUINMapDTO {
	String ProductUIN;
	String ProductID;

	public String getProductUIN() {
		return ProductUIN;
	}

	public void setProductUIN(String productUIN) {
		ProductUIN = productUIN;
	}

	public String getProductID() {
		return ProductID;
	}

	public void setProductID(String productID) {
		ProductID = productID;
	}

	boolean ProductIsPresent;

	public boolean isProductIsPresent() {
		return ProductIsPresent;
	}

	public ProductUINMapDTO(String productUIN, String productID, boolean productIsPresent) {
		super();
		ProductUIN = productUIN;
		ProductID = productID;
		ProductIsPresent = productIsPresent;
	}

	public void setProductIsPresent(boolean productIsPresent) {
		ProductIsPresent = productIsPresent;
	}

}
