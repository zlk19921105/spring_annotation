package com.zlk.within;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * desc:测试
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
//@ComponentScan("com.zlk.within"),报错
@ContextConfiguration(locations={"classpath:spring-config.xml"})//加载spring配置文件
public class IfProfileValueTest {
    @Resource
    private Member member;
    @Resource
    private Leader leader;
    // 实现
    @Test
    public void test1() {
        System.out.println("---------------member---------------");
        member.who();
        System.out.println("---------------leader---------------");
        leader.who();
    }

    @Test
    @Timed(millis = 1000)
    public void test2() {
        System.out.println("---------------member---------------");
        member.who();
        System.out.println("---------------leader---------------");
        leader.who();
    }

    @Repeat(5)
    @Test
    public void test3() {
        System.out.println("执行一次");
    }



}
