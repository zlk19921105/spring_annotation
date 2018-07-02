package com.zlk.postConstruct_preDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class Product {
    private Integer price;
    private String name;

    @Resource(name = "typeB")
    private Type type;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("In init block of Product");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("In destroy block of Product");
    }
}
