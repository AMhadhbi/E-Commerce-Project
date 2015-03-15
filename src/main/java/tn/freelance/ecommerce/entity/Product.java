package tn.freelance.ecommerce.entity;

import java.io.Serializable;

public class Product implements Serializable {

	private Long idProduct;
	private String nameProduct;
	private String description;
	private double amount;
	private String picture;

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getNbproduct() {
		return nbproduct;
	}

	public void setNbproduct(int nbproduct) {
		this.nbproduct = nbproduct;
	}

	private int nbproduct;

	public Product() {
		super();
	}

	public Product(String nameProduct) {
		super();
		this.nameProduct = nameProduct;
	}

}
