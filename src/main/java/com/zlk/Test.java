package com.zlk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/25.
 */

public class Test {
    public static void main(String[] args) {
        //加载applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取实例
        Annotation annotation =(Annotation) context.getBean("annotation");
        annotation.Show();
    }
}
