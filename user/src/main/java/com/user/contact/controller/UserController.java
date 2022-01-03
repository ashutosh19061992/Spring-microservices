package com.user.contact.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.user.contact.dao.UserDaoImpl;
import com.user.contact.model.Contact;
import com.user.contact.model.User;

@RestController
public class UserController {

	@Autowired
	private UserDaoImpl daoImpl;

//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "user/{id}")
	public ResponseEntity<User> getPersonById(@PathVariable int id) {
		User user = this.daoImpl.getUserById(id);
		if (user != null) {
			List<Contact> contacts = getUsersContacts(id);
			System.out.println(">>>>>>> failed >>>> ");
			user.setContact(contacts);
			return ResponseEntity.of(Optional.of(user));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	@HystrixCommand(fallbackMethod = "contactServiceFallBack")
	@SuppressWarnings("unchecked")
	private List<Contact> getUsersContacts(int id) {
		return this.restTemplate.getForObject("http://contact-service/contact/{userId}", List.class, id);
	}

	public List<Contact> contactServiceFallBack(int id) {
		return Arrays.asList(new Contact("", "", "", ""));
	}
}
