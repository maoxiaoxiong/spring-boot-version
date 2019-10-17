package com.boot.two.two.version.config;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.two.two.version.config
 * @date 2019/10/17 10:18 PM
 * @ClassName Swagger2SpringBoot
 */
@Configuration
@EnableSwagger2
@ComponentScan
@ConditionalOnExpression("${swagger.enable}")
public class Swagger2SpringBoot {


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("业务数据模块API")//分组名,不指定默认为default
                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .apis(RequestHandlerSelectors.basePackage("com.boot.two.two.version.controller"))// 扫描的包路径
                .paths(PathSelectors.any())// 定义要生成文档的Api的url路径规则
                .build()
                .apiInfo(apiInfo())// 设置swagger-ui.html页面上的一些元素信息
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("springboot2.2集成swagger")
                .termsOfServiceUrl("www.example.com")
                .contact(new Contact("liumei", "http://blog.csdn.net/pc_gad", "hilin2333@gmail.com"))
                .version("v0.01")
                .build();
    }
}