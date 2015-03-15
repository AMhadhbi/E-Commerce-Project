package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOrder;
	private Date dateOrder;
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customer customer;
	@OneToMany
	@JoinColumn(name = "idCommande")
	private Collection<NumberOrders> numberOrders;

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

}
