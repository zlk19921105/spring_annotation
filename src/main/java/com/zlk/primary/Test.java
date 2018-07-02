package com.zlk.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
@Service
public class Test {
    @Autowired
    private S1 s;

    void show(){
        System.out.println(s.sing("ss"));
    }

    public static void main(String[] args) {
        //加载applicationContext.xml
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //获取实例
//        Test annotation =(Test) context.getBean("test");
        ApplicationContext context = new ClassPathXmlApplicationContext("/resources/Beans.xml");
        Test test = (Test) context.getBean("test");
        test.show();
    }
}
