package com.zlk.dependsOn;

import org.springframework.context.annotation.*;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/25.
 */
@Configuration
@ComponentScan("com.zlk.dependsOn")
public class Test {

    @Bean
    public DependsB dependsB () {
        System.out.println("B");
        return new DependsB();
    }

    @Bean
    @DependsOn("dependsB")
    public DependsA dependsA () {
        System.out.println("A");
        return new DependsA();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Test.class);
    }
}
