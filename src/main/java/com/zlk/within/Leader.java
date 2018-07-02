package com.zlk.within;

import com.zlk.within.Member;
import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
@Component
public class Leader extends Member {
    @Override
    public void say() {
        System.out.println("hello, members");
    }

    @Override
    public void who() {
        System.out.println("leader");
    }

    @Override
    public void doSomething() {
        System.out.println("leader doSomething");
    }

    public void self() {
        System.out.println("leader self");
    }
}