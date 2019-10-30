package com.maoxiaoxiong.version.bootstrap.conditional;

import com.maoxiaoxiong.version.bootstrap.annotation.OnSystemPropertyCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.conditional
 * @date 2019/10/29 10:23 PM
 * @ClassName ConditionOnSystemProperty
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({OnSystemPropertyCondition.class})
public @interface ConditionOnSystemProperty {

    String name();


    String value();


}
