package com.zlk.primary;

import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
@Component// 加注解，让spring识别
public class S1 implements  S {

    public String sing(String lyrics){
        return "s1";
    }
}