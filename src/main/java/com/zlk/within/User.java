package com.zlk.within;

/**
 * desc:用户类（父类）
 *
 * @author zhoulk
 *         Date:  2018/6/28.
 */
public abstract class User {
    public abstract void who();

    public void say() {
        System.out.println("hello");
    }

    public void root() {
        System.out.println("user");
    }
}
