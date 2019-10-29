package com.maoxiaoxiong.version.bootstrap;

import com.maoxiaoxiong.version.bootstrap.conditional.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap
 * @date 2019/10/29 10:33 PM
 * @ClassName TestConditionOnSystemBootstrap
 */
//@SpringBootApplication

public class TestConditionOnSystemBootstrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "wangzhixiong")
    public String helloWord() {

        return "maoxiaoxiong";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(TestConditionOnSystemBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        System.out.println("wahah");
        String myRepository = context.getBean("helloWord", String.class);
        System.out.println(myRepository);

        context.close();
    }
}
