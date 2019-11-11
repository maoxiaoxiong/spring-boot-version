package com.maoxiaoxiong.spring.application;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.spring.application
 * @date 2019/11/11 8:44 PM
 * @ClassName SpringApplicationTest
 */
@SpringBootApplication
public class SpringApplicationTest {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SpringApplicationTest.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);


//            new SpringApplicationBuilder()
//                    .sources(Parent.class)
//                    .child(SpringApplicationTest.class)
//                    .bannerMode(Banner.Mode.CONSOLE)
//                    .run(args);
    }
}
