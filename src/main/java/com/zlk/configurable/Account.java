package com.zlk.configurable;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;


/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@Configurable
//@Configurable("account")
@EnableSpringConfigured
public class Account {

    public Account() {
        System.out.println("Account 对象为" + "Account");
    }

    public void show(){
        System.out.println("---Account--");
    }
}
