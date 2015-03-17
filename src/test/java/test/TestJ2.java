package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.entity.Product;
import tn.freelance.ecommerce.service.IAdminCategoryService;

public class TestJ2 {

	ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
	}

	@Test
	public void testCategroy() {
		try {

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

			IAdminCategoryService metier = (IAdminCategoryService) context
					.getBean("metier");
			List<Product> prod1 = metier.listproduct();
			metier.addProduct(new Product("Pdddd1"), 1L);
			metier.addProduct(new Product("Pdddd2"), 1L);
			List<Product> prod2 = metier.listproduct();
			assertTrue(prod2.size() == prod1.size() + 2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}

	}
}
