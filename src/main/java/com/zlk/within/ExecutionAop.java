package com.zlk.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.management.modelmbean.ModelMBean;

/**
 * desc:配置AOP
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@Component
@Aspect
public class ExecutionAop {

    @Before("@within(com.zlk.within.Secure)")
    public void execute1(){
        System.out.println("@within(com.Secure)");
    }

    @Before("execution(* com.zlk..*(..)) && @target(com.zlk.within.Secure)")
    public void execute2(){
        System.out.println("@target(com.learn.annotation.Secure)");
    }

}