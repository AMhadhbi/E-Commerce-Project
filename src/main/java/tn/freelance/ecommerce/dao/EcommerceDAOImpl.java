package tn.freelance.ecommerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.entity.Role;
import tn.freelance.ecommerce.entity.User;

@PersistenceContext
public class EcommerceDAOImpl implements ICommerceDAO {

	private EntityManager em;

	@Override
	public Long addCategory(Category c) {
		em.persist(c);
		return c.getIdCategory();
	}

	@Override
	public List<Category> listCategory() {
		Query req = em.createQuery("select c from Category c");
		return req.getResultList();
	}

	@Override
	public Category getCategory(Long idCat) {
		return em.find(Category.class, idCat);
	}

	@Override
	public void deleteCategory(Long idcat) {
		Category c = em.find(Category.class, idcat);
		em.remove(c);
	}

	@Override
	public void updateCategory(Category c) {
		em.merge(c);

	}

	@Override
	public Long addProduct(Product p, Long idCat) {
		Category c = getCategory(idCat);
		p.setCategory(c);
		em.persist(p);
		return p.getIdProduct();
	}

	@Override
	public List<Product> listproduct() {
		Query req = em.createQuery("select p from Product p");
		return req.getResultList();
	}

	@Override
	public List<Product> searchProduct(String mc) {
		Query req = em
				.createQuery("select p from Product p where p.nameProduct like:x or p.description like:x");
		req.setParameter("x", "%" + mc + "%");
		return req.getResultList();
	}

	@Override
	public List<Product> productbyCategory(Long idCat) {
		Query req = em
				.createQuery("select p from Product p where p.category.idCategory=:x");
		req.setParameter("x", idCat);
		return req.getResultList();
	}

	@Override
	public List<Product> productselected() {
		Query req = em
				.createQuery("select p from Product p where p.selected=true");
		return req.getResultList();
	}

	@Override
	public Product getProduc(Long idP) {
		return em.find(Product.class, idP);
	}

	@Override
	public void deleteProduct(Long idP) {
		Product p = getProduc(idP);
		em.remove(p);

	}

	@Override
	public void updateProduct(Product p) {
		em.merge(p);

	}

	@Override
	public void addUser(User u) {
		em.persist(u);

	}

	@Override
	public void attribuetRole(Role r, Long userID) {
		User u = em.find(User.class, userID);
		u.getRoles().add(r);
		em.persist(r);

	}

}
