package com.boot.two.two.version;

import com.boot.two.two.version.config.ConfigComValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 */


//spring-task
@EnableAsync
@EnableScheduling
//简单的task end
@SpringBootApplication
public class TwoVersionApplication {
    @Autowired
    private ConfigComValue configComValue;


    public static void main(String[] args) {
        SpringApplication.run(TwoVersionApplication.class, args);
    }


    @Bean
    public void test(){
        System.out.println(configComValue.test());
    }


}
