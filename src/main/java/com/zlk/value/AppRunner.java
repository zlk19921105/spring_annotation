package com.zlk.value;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/26.
 */
@Component
public class AppRunner implements InitializingBean {

    /**
     * 引用一个配置项
     */
    @Value("${app.port}")
    private int port;

    /**
     * 调用容器的一个bean的方法获取值
     */
    @Value("#{userService.count()}")
    private int userCount;

    /**
     * 调用容器的一个bean的方法，且传入一个配置项的值作为参数
     */
    @Value("#{userService.max(${app.size})}")
    private int max;

    /**
     * 简单的运算
     */
    @Value("#{${app.size} <= '12345'.length() ? ${app.size} : '12345'.length()}")
    private int min;

    //测试
    public void afterPropertiesSet() throws Exception {
        System.out.println("port : " + port);
        System.out.println("userCount : " + userCount);
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
