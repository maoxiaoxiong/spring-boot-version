package com.maoxiaoxiong.version;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan(basePackages = "com.maoxiaoxiong.version.two.web.servlet")
public class VersionTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VersionTwoApplication.class, args);
    }

}
