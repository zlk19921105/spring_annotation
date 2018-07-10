package com.zlk.aspect;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class ClientTest {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserManager userManager = (UserManager)factory.getBean("userManager");

        //可以查找张三
        userManager.findUserById(1);

        System.out.println("=====我==是==分==割==线=====");

        try {
            // 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获
            userManager.findUserById(0);
        } catch (IllegalArgumentException e) {
        }
    }
}
