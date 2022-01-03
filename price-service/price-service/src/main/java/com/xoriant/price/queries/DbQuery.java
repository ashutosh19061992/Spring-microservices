package com.xoriant.price.queries;

public class DbQuery {
	public static final String GET_PRODUCT_PRICE = "select product_id, product_title, product_price from products where product_id = ?";
}
