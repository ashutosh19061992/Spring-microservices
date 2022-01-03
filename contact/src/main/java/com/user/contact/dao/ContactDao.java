package com.user.contact.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.user.contact.models.Contact;

@Repository
public class ContactDao {

	private static List<Contact> contactList = new ArrayList<Contact>();
	static {
		contactList.add(new Contact(1, 1, "8/911/5, vikas nagar", "Lucknow"));
		contactList.add(new Contact(2, 1, "89/99798, Ashok nagar", "Kanpur"));
		contactList.add(new Contact(3, 2, "45/871, Ram nagar", "New Delhi"));
		contactList.add(new Contact(4, 2, "8/911/5, Shiva nagar", "Hyderabad"));
		contactList.add(new Contact(5, 3, "6/928/89, Vikas Nagar", "Lucknow"));
	}

	public List<Contact> getAddressByUseId(int userId) {
		return contactList.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
	}
}
