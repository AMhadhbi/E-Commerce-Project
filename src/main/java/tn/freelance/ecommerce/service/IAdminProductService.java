package tn.freelance.ecommerce.service;

import tn.freelance.ecommerce.entity.Product;

public interface IAdminProductService extends IUserService{

	public Long addProduct(Product p, Long idCat);

	public void deleteProduct(Long idP);

	public void updateProduct(Product p);

}
