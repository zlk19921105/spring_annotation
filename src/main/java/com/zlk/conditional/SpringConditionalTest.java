package com.zlk.conditional;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * desc:测试
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class SpringConditionalTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

    @Test
    public void contextTest() {
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")
                + "系统下的列表命令为："
                + listService.showListCmd());;
    }

   /* @After
    private void closeContext() {
        context.close();
    }*/
}
