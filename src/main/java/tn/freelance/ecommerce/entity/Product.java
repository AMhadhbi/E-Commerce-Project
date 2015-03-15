package tn.freelance.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduct;
	@NotEmpty
	private String nameProduct;
	private String description;
	private double amount;
	private String picture;
	@ManyToOne
	@JoinColumn(name="ID_CAT")
    private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

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
