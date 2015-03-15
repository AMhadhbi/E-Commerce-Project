package test;

import static org.junit.Assert.*;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJ1 {

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });		
			assert (true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}

	}

}
