package com.user.contact.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int id;
	private String name;
	private String phoneNo;
	private List<Contact> contacts;

	public User(int id, String name, String phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.contacts = new ArrayList<Contact>();
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

	public List<Contact> getContact() {
		return contacts;
	}

	public void setContact(List<Contact> addresses) {
		this.contacts = addresses;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNo=" + phoneNo + ", contacts=" + contacts + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
//create table person (id int not null, name varchar(100), phone_no varchar(100),  PRIMARY KEY (id), FOREIGN KEY (address_id) REFERENCES address(id));