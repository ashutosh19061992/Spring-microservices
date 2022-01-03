package com.xoriant.product.service;

import java.util.List;

import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Product;

public interface ProductService {

	// get product by brand name
	List<Product> getAllProductsOfABrand(String brandId);

	// get brand by id
	Brand getBrandById(String brandId);

	// get product by category
	List<Product> filterProductByCategory(String categoryName);

	// get product by min and max price
	List<Product> getProductsByMaxAndMinPrice(int maxPrice, int minPrice);

	// get all brands
	List<Brand> getAllBrands();

	// get all products
	List<Product> getAllProducts();

	// get product by id
	Product getProductById(int oroductId);

}