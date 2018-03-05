package com.niit.cart.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.cart.backend.config.AppContextConfig;
import com.niit.cart.backend.dao.ProductDAO;
import com.niit.cart.backend.dao.UserDAO;
import com.niit.cart.backend.model.Product;
import com.niit.cart.backend.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppContextConfig.class);
        
        UserDAO userDAO=(UserDAO)context.getBean("userDAO");
        ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
        
        //register new user
        
      /*  User user=new User();
        user.setName("John");
        user.setUsername("john");
        user.setPassword("password@123");
        user.setMobile("9830098300");
        
        userDAO.addUser(user);*/
        
        
        //add a product
        
        Product product=new Product();
        product.setProductName("EOS 70D");
        product.setBrand("Canon");
        product.setPrice(85000);
        product.setCategory("Camera");
        product.setDesc("Semi Pro camera");
        
        productDAO.addProduct(product);
        
        
        
        
    }
}
