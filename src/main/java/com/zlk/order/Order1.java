package com.zlk.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
@Configuration
@Order(5)
public class Order1{
    private final int ORDERED = 1;

    @Bean
    public Servers1 show1(){
        System.out.println("Servers1");
        return new Servers1();
    }
}