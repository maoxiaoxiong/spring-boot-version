package com.maoxiaoxiong.version.bootstrap.annotation;

import com.maoxiaoxiong.version.bootstrap.configuration.HelloWordConfiguration;
import org.springframework.cache.annotation.CachingConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.annotation
 * @date 2019/10/29 8:37 PM
 * @ClassName EnableHelloWord
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWordConfiguration.class)
@Import({HelloImportSelecor.class})
public @interface EnableHelloWord {
}
