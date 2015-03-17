package tn.freelance.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable {

	private Map<Long, NumberOrders> items = new HashMap<Long, NumberOrders>();

	public void addArticle(Product p, int number) {
		if (items.get(p.getIdProduct()) == null) {
			NumberOrders no = new NumberOrders();
			no.setProduct(p);
			no.setNumber(number);
			no.setAmount(p.getAmount());

		}

		else {
			NumberOrders no = items.get(p.getIdProduct());
			no.setNumber(no.getNumber() + number);
		}

	}

	public Collection<NumberOrders> getIems() {

		return items.values();

	}

	public double getTotal() {
		double total = 0;

		for (NumberOrders no : items.values()) {

			total += no.getAmount() * no.getNumber();

		}

		return total;
	}

	public int getSize() {
		return items.size();
	}

	public void deleteItem(Long idProduct) {
		items.remove(idProduct);
	}
}
