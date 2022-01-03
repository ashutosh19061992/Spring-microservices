package com.xoriant.product.query;

public final class DbQuery {

	public static final String GET_ALL_PRODUCT_BY_BRAND = "select * from products where product_brand = ?";

	public static final String GET_BRAND_BY_ID = "select * from brands  where brand_id = ?";

	public static final String GET_PRODUCT_BY_ID = "select * from products where id=?";

	public static final String GET_ALL_PRODUCTS = "select * from products";

	public static final String GET_CAT_BY_ID = "select * from categories  where cat_id = ?";

	public static final String GET_ALL_BRAND = "select * from brands";

	public static final String GET_PRODUCT_BET_MAX_MIN = "select * from products where product_price BETWEEN ? AND ?";

	public static final String GET_CATEGORY_BY_NAME = "select * from categories where cat_title = ?";

	public static final String GET_PRODUCTS_BY_CATEGORY = "select * from products where product_cat = ?";

}
