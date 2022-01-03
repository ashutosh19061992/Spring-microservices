package com.xoriant.product.dao;

import java.util.List;

import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Product;

public interface ProductDao {

	// get all products by brand id
	List<Product> getAllProductsOfABrand(String brandId);

	// get product by id
	Product getProductById(int oroductId);

	// get brand by id
	Brand getBrandById(String brandId);

	// get all products
	List<Product> getAllProducts();

	// get all brands
	List<Brand> getAllBrands();

	// get products between max and min price
	List<Product> getProductsByMaxAndMinPrice(int maxPrice, int minPrice);

	// filter by product category
	List<Product> filterProductByCategory(String categoryName);

}