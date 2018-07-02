package com.zlk.primary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class Demo {
    public static void main(String[] args) {
        //加载applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取实例
        Test annotation =(Test) context.getBean("test");
//        Test annotation = new Test();
        annotation.show();
    }
}
