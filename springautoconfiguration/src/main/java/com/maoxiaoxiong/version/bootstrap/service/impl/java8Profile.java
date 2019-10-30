package com.maoxiaoxiong.version.bootstrap.service.impl;

import com.maoxiaoxiong.version.bootstrap.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.service.impl
 * @date 2019/10/29 9:41 PM
 * @ClassName java8Profile
 */
@Profile("java8")
@Service
public class java8Profile implements ProfileService {
    @Override
    public String getProfile() {
        return "java8";
    }
}
