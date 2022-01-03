package com.xoriant.price.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.price.dao.PriceDaoImpl;
import com.xoriant.price.model.Price;

@Service
public class PriceImpl {

	@Autowired
	private PriceDaoImpl daoImpl;

	public Price getProductPrice(int productId) {
		return this.daoImpl.getProductPrice(productId);
	}

}
