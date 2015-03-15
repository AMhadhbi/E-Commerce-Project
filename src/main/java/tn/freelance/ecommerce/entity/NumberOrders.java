package tn.freelance.ecommerce.entity;

import java.io.Serializable;

public class NumberOrders implements Serializable{

	private Long id;
	private Product product;
	private int number;
	private double amount;
	
	
	public NumberOrders() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
