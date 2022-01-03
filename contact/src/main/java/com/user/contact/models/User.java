package com.user.contact.models;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String phoneNo;
	private List<Contact> addresses;

	public User(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.addresses = new ArrayList<Contact>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<Contact> getAddresses() {
		return addresses;
	}

	public void setAddresses(Contact address) {
		this.addresses.add(address);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNo=" + phoneNo + ", addresses=" + addresses + "]";
	}
}
