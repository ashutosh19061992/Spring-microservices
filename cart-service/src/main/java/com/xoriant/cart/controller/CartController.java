package com.xoriant.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.cart.model.ItemLine;
import com.xoriant.cart.service.CartServiceImpl;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartServiceImpl cartService;

	// find all Cart Items
	@GetMapping("/{user}")
	public List<ItemLine> findAllCartItems(@PathVariable String user) {
		return cartService.findAll(user);
	}

	// add item to the cart
	@RequestMapping(value = "/item/{user}", method = RequestMethod.POST)
	public ItemLine addItemToCart(@RequestBody ItemLine itemLine, @PathVariable String user) {
		return cartService.save(user, itemLine);
	}

	// clear cart of a given user
	@DeleteMapping("/{user}")
	public void clearCart(@PathVariable String user) {
		cartService.clearCart(user);
	}

}