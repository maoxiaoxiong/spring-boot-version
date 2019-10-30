package com.maoxiaoxiong.version.bootstrap.configuration;

import com.maoxiaoxiong.version.bootstrap.annotation.EnableHelloWord;
import com.maoxiaoxiong.version.bootstrap.conditional.ConditionOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.configuration
 * @date 2019/10/29 8:34 PM
 * @ClassName HelloWordConfiguration
 */

@Configuration
@EnableHelloWord
@ConditionOnSystemProperty(name = "user.name", value = "wangzhixiong")
public class HelloWordAutoConfiguration {

//    @Bean
//    public String helloWord() {
//        return "hello";
//    }
}
