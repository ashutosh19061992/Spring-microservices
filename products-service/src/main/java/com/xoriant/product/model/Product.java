package com.xoriant.product.model;

public class Product {

	private long id;
	private Categories categories;
	private Brand brand;
	private String title;
	private long price;
	private int quantity;
	private String description;
	private String image;
	private String keywords;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(long id, Categories categories, Brand brand, String title, long price, int quantity,
			String description, String image, String keywords) {
		super();
		this.id = id;
		this.categories = categories;
		this.brand = brand;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.image = image;
		this.keywords = keywords;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
