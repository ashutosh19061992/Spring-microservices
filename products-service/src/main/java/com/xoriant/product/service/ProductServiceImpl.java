package com.xoriant.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.product.dao.ProductDao;
import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao daoImpl;

	// get product by brand name
	@Override
	public List<Product> getAllProductsOfABrand(String brandId) {
		return this.daoImpl.getAllProductsOfABrand(brandId);
	}

	// get brand by id
	@Override
	public Brand getBrandById(String brandId) {
		return this.daoImpl.getBrandById(brandId);
	}

	// get product by category
	@Override
	public List<Product> filterProductByCategory(String categoryName) {
		return this.daoImpl.filterProductByCategory(categoryName);
	}

	// get product by min and max price
	@Override
	public List<Product> getProductsByMaxAndMinPrice(int maxPrice, int minPrice) {
		return this.getProductsByMaxAndMinPrice(maxPrice, minPrice);
	}

	// get all brands
	@Override
	public List<Brand> getAllBrands() {
		return this.getAllBrands();
	}

	// get all products
	@Override
	public List<Product> getAllProducts() {
		return this.getAllProducts();
	}

	// get product by id
	@Override
	public Product getProductById(int oroductId) {
		return this.daoImpl.getProductById(oroductId);
	}
}
