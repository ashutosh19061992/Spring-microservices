package com.xoriant.product.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.product.model.Brand;
import com.xoriant.product.model.Categories;
import com.xoriant.product.model.Product;
import com.xoriant.product.query.DbQuery;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// get all products by brand id
	@Override
	public List<Product> getAllProductsOfABrand(String brandId) {
		// get products by category
		return this.jdbcTemplate.query(DbQuery.GET_ALL_PRODUCT_BY_BRAND, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
				product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));
				product.setId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImage(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, brandId);
	}

	// get product by id
	@Override
	public Product getProductById(int oroductId) {
		return this.jdbcTemplate.query(DbQuery.GET_PRODUCT_BY_ID, (ResultSet rs) -> {
			Product product = new Product();
			product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
			product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));
			product.setId(rs.getInt("product_id"));
			product.setDescription(rs.getString("product_desc"));
			product.setImage(rs.getString("product_image"));
			product.setKeywords(rs.getString("product_keywords"));
			product.setPrice(rs.getInt("product_price"));
			product.setQuantity(rs.getInt("product_qty"));
			product.setTitle(rs.getString("product_title"));
			return product;
		}, oroductId);
	}

	// get category by id
	private Categories getCategoryById(String catId) {
		return this.jdbcTemplate.queryForObject(DbQuery.GET_CAT_BY_ID, (ResultSet rs, int rowNum) -> {
			Categories category = new Categories();
			category.setCatId(rs.getInt("cat_id"));
			category.setTittle(rs.getString("cat_title"));
			return category;
		}, catId);
	}

	// get brand by id
	@Override
	public Brand getBrandById(String brandId) {
		return this.jdbcTemplate.queryForObject(DbQuery.GET_BRAND_BY_ID, (ResultSet rs, int rowNum) -> {
			Brand brand = new Brand();
			brand.setId(rs.getInt("brand_id"));
			brand.setTittle(rs.getString("brand_title"));
			return brand;
		}, brandId);
	}

	// get all products
	@Override
	public List<Product> getAllProducts() {

		return this.jdbcTemplate.query(DbQuery.GET_ALL_PRODUCTS, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
				product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));
				product.setId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImage(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		});
	}

	// get all brands
	@Override
	public List<Brand> getAllBrands() {
		return this.jdbcTemplate.query(DbQuery.GET_ALL_PRODUCTS, (ResultSet rs) -> {
			List<Brand> brands = new ArrayList<Brand>();
			while (rs.next()) {
				Brand brand = new Brand();
				brand.setId(rs.getInt("brand_id"));
				brand.setTittle(rs.getString("brand_title"));
				brands.add(brand);
			}
			return brands;
		});
	}

	// get products between max and min price
	@Override
	public List<Product> getProductsByMaxAndMinPrice(int maxPrice, int minPrice) {
		return this.jdbcTemplate.query(DbQuery.GET_PRODUCT_BET_MAX_MIN, (ResultSet rs) -> {
			List<Product> productList = new ArrayList<Product>();
			while (rs.next()) {
				Product product = new Product();
				product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
				product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));
				product.setId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImage(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, maxPrice, minPrice);
	}

	private Categories getCategoryByName(String categoryName) {
		return this.jdbcTemplate.queryForObject(DbQuery.GET_CATEGORY_BY_NAME, (ResultSet rs, int rowNum) -> {
			Categories category = new Categories();
			category.setCatId(rs.getInt("cat_id"));
			category.setTittle(rs.getString("cat_title"));
			return category;
		}, categoryName);
	}

	// filter by product category
	@Override
	public List<Product> filterProductByCategory(String categoryName) {
		List<Product> productList = new ArrayList<Product>();
		Categories category = getCategoryByName(categoryName);
		return this.jdbcTemplate.query(DbQuery.GET_PRODUCTS_BY_CATEGORY, (ResultSet rs) -> {
			while (rs.next()) {
				Product product = new Product();
				product.setCategories(getCategoryById(String.valueOf(rs.getInt("product_cat"))));
				product.setBrand(getBrandById(String.valueOf(rs.getInt("product_brand"))));
				product.setId(rs.getInt("product_id"));
				product.setDescription(rs.getString("product_desc"));
				product.setImage(rs.getString("product_image"));
				product.setKeywords(rs.getString("product_keywords"));
				product.setPrice(rs.getInt("product_price"));
				product.setQuantity(rs.getInt("product_qty"));
				product.setTitle(rs.getString("product_title"));
				productList.add(product);
			}
			return productList;
		}, category.getCatId());
	}
}
