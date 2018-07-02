package com.zlk.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * desc:判断系统为linux
 *
 * @author zhoulk
 *         Date:  2018/6/27.
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        return conditionContext.getEnvironment().getProperty("os.name").contains("Linux");
    }

}