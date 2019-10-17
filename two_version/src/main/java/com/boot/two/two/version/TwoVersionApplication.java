package com.boot.two.two.version;

import com.boot.two.two.version.config.Mybean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TwoVersionApplication {
    @Autowired
    private Mybean mybean;


    public static void main(String[] args) {
        SpringApplication.run(TwoVersionApplication.class, args);
    }


    @Bean
    public void test(){
        System.out.println(mybean.test());
    }


}
