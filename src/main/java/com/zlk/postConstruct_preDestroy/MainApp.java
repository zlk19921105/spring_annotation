package com.zlk.postConstruct_preDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "resources/BeansJSRAnnotation.xml");

        Product product = (Product) context.getBean("product");

        System.out.println("Product Name : " + product.getName());
        System.out.println("Price : " + product.getPrice());

        Type productType = product.getType();

        System.out.println(product.getName() + " is of type:"
                + productType.getProductType());
        context.registerShutdownHook();
    }
}
