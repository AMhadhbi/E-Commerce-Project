package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Category implements Serializable{
	
	private Long  idCategory;
	private String nameCategory; 
	private String description;
	private String namePicture;
	private byte[] picture;
	private Collection<Product> products=new ArrayList<Product>();
	
	
	public Category() {
		super();
	}
	
	
	public Category(String nameCategory) {
		super();
		this.nameCategory = nameCategory;
	}


	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNamePicture() {
		return namePicture;
	}
	public void setNamePicture(String namePicture) {
		this.namePicture = namePicture;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	

}
