package com.boot.two.two.version.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.two.two.version.config
 * @date 2019/10/17 8:49 PM
 * @ClassName Mybean
 */

@Component
public class Mybean {


    @Value("${names}")
    private  String name;


    public  String test(){
        System.out.println(name+"11");
        return name;
    }


}
