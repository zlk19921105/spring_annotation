package com.zlk.webAppConfiguration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.IfProfileValue;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * desc:测试
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@IfProfileValue(name="java.vendor", value="com zlk within.")
//@IfProfileValue(name="test-groups", values={"unit-tests", "integration-tests"})
@ContextConfiguration(classes = ConfigurationUser.class)
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class })
@Transactional
//@WebAppConfiguration("src/main/webapp")
public class UserTest {

    /*@Autowired
    protected WebApplicationContext webAppContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        //MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
    }*/

    @Resource
    private User user;

    @Test
    public void test1() {
        System.out.println(user);
        System.out.println("---------------leader---------------");
    }


}
