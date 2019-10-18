package com.boot.two.two.version.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

/**
 * 若是数据源 则只设置getter方法
 */
@Configuration
@PropertySource("classpath:config/jdbc.properties")
@ConfigurationProperties(prefix = "db.link")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Validated
public class PropConfPrefix {
    private String url;
    private String driver;
    private String username;
    private String password;

    public void show() {
        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
