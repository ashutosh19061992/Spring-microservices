package com.xoriant.product.model;

public class Brand {

	private long id;
	private String tittle;

	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(long id, String tittle) {
		super();
		this.id = id;
		this.tittle = tittle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", tittle=" + tittle + "]";
	}

}
