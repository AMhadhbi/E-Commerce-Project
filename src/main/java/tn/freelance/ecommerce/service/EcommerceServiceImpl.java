package tn.freelance.ecommerce.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tn.freelance.ecommerce.dao.ICommerceDAO;
import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.entity.Role;
import tn.freelance.ecommerce.entity.User;

@Transactional
public class EcommerceServiceImpl implements IAdminProductService,IUserService,IAdminCategory {
   
	private ICommerceDAO dao;
	
	public void setDao(ICommerceDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long addProduct(Product p, Long idCat) {
	
		return dao.addProduct(p, idCat);
	}

	@Override
	public void deleteProduct(Long idP) {
		
      dao.deleteProduct(idP);
	}

	@Override
	public void updateProduct(Product p) {
		dao.updateProduct(p);

	}

	@Override
	public List<Category> listCategory() {
		
		return dao.listCategory();
	}

	@Override
	public Category getCategory(Long idCat) {
		
		return dao.getCategory(idCat);
	}

	@Override
	public List<Product> listproduct() {
	
		return dao.listproduct();
	}

	@Override
	public List<Product> searchProduct(String mc) {
		
		return dao.searchProduct(mc);
	}

	@Override
	public List<Product> productbyCategory(Long idCat) {
		
		return dao.productbyCategory(idCat);
	}

	@Override
	public List<Product> productselected() {
		
		return dao.productselected();
	}

	@Override
	public Product getProduc(Long idP) {
		
		return dao.getProduc(idP);
	}

	@Override
	public Long addCategory(Category c) {
		
		return dao.addCategory(c);
	}

	@Override
	public void deleteCategory(Long idcat) {
	       dao.deleteCategory(idcat);
	}

	@Override
	public void updateCategory(Category c) {
		dao.updateCategory(c);
		
	}

	@Override
	public void addUser(User u) {
		dao.addUser(u);
		
	}

	@Override
	public void attribuetRole(Role r, Long userID) {
		dao.attribuetRole(r, userID);
		
	}

}
