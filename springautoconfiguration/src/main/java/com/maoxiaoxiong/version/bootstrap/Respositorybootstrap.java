package com.maoxiaoxiong.version.bootstrap;

import com.maoxiaoxiong.version.bootstrap.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap
 * @date 2019/10/29 7:31 PM
 * @ClassName Respositorybootstrap
 */
@ComponentScan(basePackages = "com.maoxiaoxiong.version.bootstrap.repository")
public class Respositorybootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Respositorybootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyRepository myRepository = context.getBean("myRepository", MyRepository.class);
        System.out.println(myRepository);

        context.close();
    }
}
