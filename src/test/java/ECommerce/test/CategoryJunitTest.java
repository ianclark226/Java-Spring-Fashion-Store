package ECommerce.test;

import ECommerce.DAO.CategoryDAO;
import ECommerce.model.Category;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class CategoryJunitTest {

    static CategoryDAO categoryDAO;

    @BeforeClass

    public static void executeFirst() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("ECommerce");
        context.refresh();

        categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
    }

    @Test
    public void addCategoryTest() {
        Category category = new Category();

        category.setCategoryName("T-Shirt");
        category.setCategoryDesc("All varieties");

        assertTrue("Problem in adding", categoryDAO.addCategory(category));
    }
}
