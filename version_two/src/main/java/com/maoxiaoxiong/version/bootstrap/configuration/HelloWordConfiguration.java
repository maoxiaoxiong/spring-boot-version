package com.maoxiaoxiong.version.bootstrap.configuration;

import com.maoxiaoxiong.version.bootstrap.annotation.EnableHelloWord;
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
public class HelloWordConfiguration {

    @Bean
    public String helloWord() {
        return "hello";
    }
}
