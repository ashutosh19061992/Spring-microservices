package com.xoriant.product.model;

public class Categories {

	private int catId;
	private String tittle;

	public Categories(int catId, String tittle) {
		super();
		this.catId = catId;
		this.tittle = tittle;
	}

	public Categories() {
		// TODO Auto-generated constructor stub
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	@Override
	public String toString() {
		return "Categories [catId=" + catId + ", tittle=" + tittle + "]";
	}
	
}
