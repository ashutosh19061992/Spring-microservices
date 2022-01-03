package com.xoriant.product.model;

public class Order {

	private long id;
	private long userId;
	private long productId;
	private int quantity;
	private String transactionId;
	private String productStatus;
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(long id, long userId, long productId, int quantity, String transactionId, String productStatus) {
		super();
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.quantity = quantity;
		this.transactionId = transactionId;
		this.productStatus = productStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", productId=" + productId + ", quantity=" + quantity
				+ ", transactionId=" + transactionId + ", productStatus=" + productStatus + "]";
	}
	
}
