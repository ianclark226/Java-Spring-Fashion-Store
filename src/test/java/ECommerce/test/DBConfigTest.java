package ECommerce.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class DBConfigTest {
    public static void main(String[]args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("ECommerce");
        context.refresh();


    }
}