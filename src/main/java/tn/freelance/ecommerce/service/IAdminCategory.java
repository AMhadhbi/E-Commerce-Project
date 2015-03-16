package tn.freelance.ecommerce.service;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Role;
import tn.freelance.ecommerce.entity.User;

public interface IAdminCategory extends IAdminProductService {

	public Long addCategory(Category c);

	public void deleteCategory(Long idcat);

	public void updateCategory(Category c);

	public void addUser(User u);

	public void attribuetRole(Role r, Long userID);

}
