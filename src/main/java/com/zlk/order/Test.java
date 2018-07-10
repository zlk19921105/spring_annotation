package com.zlk.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.zlk.order");


     }
}
