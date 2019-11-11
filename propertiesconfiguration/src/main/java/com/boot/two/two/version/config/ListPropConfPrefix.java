package com.boot.two.two.version.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * 若是数据源 则只设置getter方法
 */
@Configuration
@PropertySource("classpath:config/list.properties")
@ConfigurationProperties(prefix = "aaa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListPropConfPrefix {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    private List<String> host = new ArrayList<>();

    public void show() {
    }
}
