package com.maoxiaoxiong.version.bootstrap;

import com.maoxiaoxiong.version.bootstrap.annotation.EnableHelloWord;
import com.maoxiaoxiong.version.bootstrap.configuration.HelloWordConfiguration;
import com.maoxiaoxiong.version.bootstrap.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
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
@EnableHelloWord
public class ImportSelectorbootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ImportSelectorbootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String myRepository = context.getBean("helloWord", String.class);
        System.out.println(myRepository);

        context.close();
    }
}
