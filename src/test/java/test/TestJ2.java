package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tn.freelance.ecommerce.entity.Category;
import tn.freelance.ecommerce.service.EcommerceServiceImpl;
import tn.freelance.ecommerce.service.IAdminCategoryService;

public class TestJ2 {

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });

			IAdminCategoryService metier = (IAdminCategoryService) context
					.getBean("metier");
			List<Category> cats1 = metier.listCategory();
			metier.addCategory(new Category("CAT1"));
			metier.addCategory(new Category("CAT2"));
			metier.addCategory(new Category("CAT2"));
			List<Category> cats2 = metier.listCategory();

			assertTrue(cats2.size() == cats1.size() + 2);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}

	}
}
