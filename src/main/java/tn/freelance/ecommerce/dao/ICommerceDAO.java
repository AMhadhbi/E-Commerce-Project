package tn.freelance.ecommerce.dao;

import java.util.List;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.entity.Role;
import tn.freelance.ecommerce.entity.User;

public interface ICommerceDAO {

	public Long addCategory(Category c);
	public List<Category> listCategory();
	public Category getCategory(Long idCat);
	public void deleteCategory(Long idcat);
	public void updateCategory(Category c);
	public Long addProduct (Product p, Long idCat);
	public List<Product> listproduct();
	public List<Product> searchProduct(String mc);
	public List<Product> productbyCategory(Long idCat);
	public List<Product> productselected();
	public Product getProduc(Long idP);
	public void deleteProduct(Long idP);
	public void updateProduct(Product p);
	public void addUser(User u);
	public void attribuetRole(Role r,Long userID);
	
}
