package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Order implements Serializable{
	
	private Long idOrder;
	private Date dateOrder;
	private Customer customer;
	
	
	public Order() {
		super();
	}
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Collection<NumberOrders> getNumberOrders() {
		return numberOrders;
	}
	public void setNumberOrders(Collection<NumberOrders> numberOrders) {
		this.numberOrders = numberOrders;
	}
	private Collection<NumberOrders> numberOrders;

}
