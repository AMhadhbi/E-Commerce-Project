package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.service.EcommerceServiceImpl;
import tn.freelance.ecommerce.service.IAdminCategoryService;

public class TestJ2 {

	@Test
	public void testCategroy() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });

			IAdminCategoryService metier = (IAdminCategoryService) context
					.getBean("metier");
			List<Category> cats1 = metier.listCategory();
			metier.addCategory(new Category("CAT1"));
			metier.addCategory(new Category("CAT2"));
			List<Category> cats2 = metier.listCategory();
			assertTrue(cats2.size() == cats1.size() + 2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}

	}

	@Test
	public void testProduct() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });

			IAdminCategoryService metier = (IAdminCategoryService) context
					.getBean("metier");
			List<Product> prod1 = metier.listproduct();
			metier.addProduct(new Product("P1"), 1L);
			metier.addProduct(new Product("P2"), 1L);
			List<Product> prod2 = metier.listproduct();
			assertTrue(prod1.size() == prod2.size() + 2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}

	}
}
