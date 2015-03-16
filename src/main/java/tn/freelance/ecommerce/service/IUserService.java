package tn.freelance.ecommerce.service;

import java.util.List;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;

public interface IUserService {
	
	public List<Category> listCategory();

	public Category getCategory(Long idCat);
	
	public List<Product> listproduct();

	public List<Product> searchProduct(String mc);

	public List<Product> productbyCategory(Long idCat);
	
	public List<Product> productselected();

	public Product getProduc(Long idP);

}
