package com.boot.two.two.version.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/jdbc.properties")
//此处可以指定个配置文件
//@PropertySources(@PropertySource(“xxx”),@PropertySource(“xxx”))。
public class PropConf {

    @Value("${db.link.url}")
    private String url;
    @Value("${db.link.driver}")
    private String driver;
    @Value("${db.link.username}")
    private String username;
    @Value("${db.link.password}")
    private String password;

    public void show() {
        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }

//    @Value("${my.value1}")
//    private String value1;
//    @Value("${my.value2}")
//    private String value2;
//
//    public String show() {
//
//        return value1 + ":" + value2;
//    }
}
