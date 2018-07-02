package com.zlk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/25.
 *
 *         注：报错
 */


public class TestConfiguration {

    public static void main(String[] args) {

        // @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        //和使用ApplicationContext.xml加载的效果相同
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        //获取实例c
        Annotation annotation =(Annotation) context.getBean("annotation");
        annotation.Show();
    }
}
