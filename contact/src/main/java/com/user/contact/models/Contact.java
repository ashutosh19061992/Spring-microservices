package com.user.contact.models;

public class Contact {
	
	private int userId;
	private int id;
	private String houseAddress;
	private String city;
	
	public Contact( int id, int userId, String houseAddress, String city) {
		super();
		this.id = id;
		this.userId = userId;
		this.houseAddress = houseAddress;
		this.city = city;
		
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
