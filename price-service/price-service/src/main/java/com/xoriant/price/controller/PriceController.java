package com.xoriant.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.price.model.Price;
import com.xoriant.price.service.PriceImpl;

@RestController
@RequestMapping("/price")
public class PriceController {

	@Autowired
	private PriceImpl priceImpl;

	@RequestMapping(value = "/product/{productId}")
	public ResponseEntity<?> getProductByCategory(@PathVariable int productId) {
		Price product = this.priceImpl.getProductPrice(productId);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
}
