package com.zlk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/25.
 *         配置类，替换xml
 */
@Configuration
public class ConfigurationDemo {
    // @Bean注解注册bean,同时可以指定初始化和销毁方法
    // @Bean(name="annotation",initMethod="start",destroyMethod="cleanUp")
    @Bean()
    @Scope("prototype")//singleton：单例，默认值prototype：多例
    public Annotation annotation() {
        return new Annotation();
    }
}
