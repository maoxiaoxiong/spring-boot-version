package com.maoxiaoxiong.version.bootstrap;

import com.maoxiaoxiong.version.bootstrap.annotation.EnableHelloWord;
import com.maoxiaoxiong.version.bootstrap.service.ProfileService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap
 * @date 2019/10/29 8:32 PM
 * @ClassName ImportSelectorbootstrap
 */
@SpringBootApplication(scanBasePackages = "com.maoxiaoxiong.version.bootstrap.service")
public class Profilebootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Profilebootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);

        ProfileService myRepository = context.getBean(ProfileService.class);
        System.out.println(myRepository.getProfile());

        context.close();
    }
}
