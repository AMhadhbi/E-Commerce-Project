package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;

public class Customer implements Serializable{
	
	private Long idCustomer;
	private String nameCustomer;
	private String adress;
	private String email;
	private String tel;
	private Collection<Order> orders;
	
	public Customer(String nameCustomer) {
		super();
		this.nameCustomer = nameCustomer;
	}
	public Customer() {
		super();
	}
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Collection<Order> getOrders() {
		return orders;
	}
	public void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}
	
	

}
