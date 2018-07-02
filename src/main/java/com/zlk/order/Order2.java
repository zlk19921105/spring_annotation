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
@Order(2)
public class Order2 {
    private final int ORDERED = 2;

    @Bean
    public Servers2 show2(){
        System.out.println("Servers2");
        return new Servers2();
    }
}