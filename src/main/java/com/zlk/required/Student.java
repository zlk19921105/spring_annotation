package com.zlk.required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/26.
 *         测试@Required注解
 */

public class Student {
    private String name;
    private String age;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Required
    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/resources/Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
