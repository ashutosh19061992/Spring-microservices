package com.user.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.contact.dao.ContactDao;
import com.user.contact.models.Contact;

@RestController
@RequestMapping(value = "/contact")
public class ContactController {

	@Autowired
	private ContactDao contactDao;

	@RequestMapping(value = "/{userId}")
	public List<Contact> getAddressById(@PathVariable int userId) {
		return this.contactDao.getAddressByUseId(userId);
	}
}
