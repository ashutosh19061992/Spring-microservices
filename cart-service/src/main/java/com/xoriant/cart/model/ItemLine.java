package com.xoriant.cart.model;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("itemLine")
public class ItemLine implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Item item;
	private int qty;

	public ItemLine() {
		// TODO Auto-generated constructor stub
	}

	public ItemLine(Item item, int qty) {
		super();
		this.item = item;
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "ItemLine [item=" + item + ", qty=" + qty + "]";
	}
}
