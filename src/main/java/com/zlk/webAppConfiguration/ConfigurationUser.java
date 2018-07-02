package com.zlk.webAppConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@Configuration
public class ConfigurationUser {

    @Bean
    @Scope("prototype")//singleton：单例，默认值prototype：多例
    public User user(){
        return new User();
    }
}
