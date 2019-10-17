package com.boot.two.two.version.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.two.two.version.controller
 * @date 2019/10/17 9:19 PM
 * @ClassName ValueTest
 */
@RestController
@RequestMapping("/twst")
@Api(value = "测试", description = "测试Controller", tags = "test")
public class ValueTest {

    @Value("${names}")
    private String name;

    @ApiOperation(value = "获取用户列表", notes = "获取用户列表", httpMethod = "GET")
    @GetMapping("/namess")
    public String getNames() {
//        System.out.println(name);
        return name;
    }

}
