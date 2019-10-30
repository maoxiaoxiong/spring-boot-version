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
 * @pakageName com.maoxiaoxiong.version.bootstrap.service
 * @date 2019/10/29 9:36 PM
 * @ClassName Java7Profile
 */
@Profile("java7")
@Service
public class Java7Profile implements ProfileService {
    @Override
    public String getProfile() {
        return "java7";
    }
}
