package com.xoriant.cart.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import com.xoriant.cart.model.ItemLine;

@Repository
public class CartDaoImpl {
	 	
	@Autowired
	private RedisTemplate<String, ItemLine> template;
	
	@Resource(name="redisTemplate")
	private ListOperations<String, ItemLine> listOps;
	
	// save cart Item to the cart
	public ItemLine save(String user,ItemLine itemLine) {
		System.out.println(">>> user:: "+user);
//		template.opsForHash().put("user", user, itemLine);
		listOps.leftPush(user, itemLine);
		return itemLine;
	}
	
	// load all cart items
	public List<ItemLine> findAll(String user){
		return listOps.range(user, 0, -1);
	}
	
	// clear cart for a user
	public void clearCart(String user) {
		template.delete(user);
	}
}
