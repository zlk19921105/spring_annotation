package com.zlk.configurable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
public class Test {
    public static void main(String[] args) {
        //加载applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configurable.xml");
        //获取实例
        Account account =(Account) context.getBean("account");
        account.show();
    }
}
