package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Category implements Serializable{
	@Id
	@GeneratedValue
	private Long  idCategory;
	@NotEmpty
	@Size(min=4,max=20)
	private String nameCategory; 
	private String description;
	private String namePicture;
	@Lob
	private byte[] picture;
	@OneToMany(mappedBy="category")
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
