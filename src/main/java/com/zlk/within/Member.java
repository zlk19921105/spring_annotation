package com.zlk.within;

import com.zlk.within.*;
import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@Component
public class Member extends com.zlk.within.User {

    @Override
    public void who() {
        System.out.println("member");
    }

    public void doSomething() {
        System.out.println("member doSomething");
    }

    public void getCompany() {
        System.out.println("zero tec");
    }
}
