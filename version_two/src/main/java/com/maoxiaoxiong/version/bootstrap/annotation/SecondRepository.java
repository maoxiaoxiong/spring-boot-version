package com.maoxiaoxiong.version.bootstrap.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.repositoryinterface
 * @date 2019/10/29 7:23 PM
 * @ClassName SecondRepository
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@FirstRepository
public @interface SecondRepository {
    String value() default "";
}
