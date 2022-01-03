package com.user.contact.model;


public class Contact{

	private String houseAddress;
	private String city;
	private String state;
	private String pinCode;

	public Contact(String houseAddress, String city, String state, String pinCode) {
		super();
		this.houseAddress = houseAddress;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Contact [houseAddress=" + houseAddress + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ ", getHouseAddress()=" + getHouseAddress() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getPinCode()=" + getPinCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
