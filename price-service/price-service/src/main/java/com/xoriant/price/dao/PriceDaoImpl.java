package com.xoriant.price.dao;

import java.sql.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.price.model.Price;
import com.xoriant.price.queries.DbQuery;

@Repository
public class PriceDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Price getProductPrice(int productId) {
		return this.jdbcTemplate.queryForObject(DbQuery.GET_PRODUCT_PRICE, (ResultSet rs, int rowNum) -> {
			Price price = new Price();

			price.setProductId(rs.getInt("product_id"));
			price.setProductPrice(rs.getDouble("product_price"));
			price.setProductTitle(rs.getString("product_title"));
			return price;

		}, productId);
	}
}