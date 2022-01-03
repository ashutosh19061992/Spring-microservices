package com.xoriant.product.model;

public class Cart {

	private long id;
	private Product product;
	private String ipAddress;
	private User user;
	private int quantity;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(long id, Product product, String ipAddress, User user, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.ipAddress = ipAddress;
		this.user = user;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + ", ipAddress=" + ipAddress + ", user=" + user + ", quantity="
				+ quantity + "]";
	}
}
