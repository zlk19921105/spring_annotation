package com.zlk.async;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
@Configuration
@EnableAsync
public class SpringAsyncConfig {

    @Async  //标注使用
    public void asyncMethodWithVoidReturnType() {
        System.out.println("Execute method asynchronously. "
               + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new SpringAsyncConfig().asyncMethodWithVoidReturnType();
    }
}
