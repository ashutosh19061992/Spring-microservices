package com.user.contact.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.user.contact.model.User;

@Repository
public class UserDaoImpl {

	private static List<User> userList = new ArrayList<User>();
	static {
		userList.add(new User(1, "Ashutosh", "9532975009"));
		userList.add(new User(2, "Shivani", "8798786545"));
		userList.add(new User(3, "Hema", "8989876545"));
	}

	public User getUserById(int id) {
		return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
	}
}
