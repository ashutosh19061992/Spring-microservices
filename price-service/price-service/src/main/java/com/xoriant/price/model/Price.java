package com.xoriant.price.model;

public class Price {

	private int productId;
	private double productPrice;
	private String productTitle;

	public Price(int productId, double productPrice, String productTitle) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productTitle = productTitle;
	}

	public Price() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	@Override
	public String toString() {
		return "Price [productId=" + productId + ", productPrice=" + productPrice + ", productTitle=" + productTitle
				+ "]";
	}
}
