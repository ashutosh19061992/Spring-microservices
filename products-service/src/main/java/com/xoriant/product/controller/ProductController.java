package com.xoriant.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.product.model.Product;
import com.xoriant.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productServiceImpl;

	@RequestMapping(value = "/brand/{brandId}")
	public ResponseEntity<?> getAllProductsOfABrand(@PathVariable String brandId) {

		List<Product> productsOfThisBrand = this.productServiceImpl.getAllProductsOfABrand(brandId);

		if (!productsOfThisBrand.isEmpty()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(productsOfThisBrand);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}

	@RequestMapping(value = "/category/{catgName}")
	public ResponseEntity<?> getProductByCategory(@PathVariable String catgName) {

		List<Product> filterProductByCategory = this.productServiceImpl.filterProductByCategory(catgName);

		if (!filterProductByCategory.isEmpty()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(filterProductByCategory);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("[]");
	}
}
