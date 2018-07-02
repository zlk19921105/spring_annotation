package com.zlk.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * desc:
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
@Component// 加注解，让spring识别
@Primary//注入时，选择注入S2
public class S2 implements  S {

    @Override
    public String sing(String lyrics){
        return "s2";
    }
}