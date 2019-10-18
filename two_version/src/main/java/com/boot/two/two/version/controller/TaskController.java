package com.boot.two.two.version.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.two.two.version.controller
 * @date 2019/10/18 11:18 PM
 * @ClassName TaskController
 */

@Component
//开启异步
@Async("true")
public class TaskController {
    /** 此注解
     * org.springframework.scheduling.annotation.Scheduled
     * 在线生成器
     * http://cron.qqe2.com/
     */

    @Scheduled(cron = "0/5 * * * * ? ")
    public void scheduledTest() {
        System.out.println("定时任务：");
    }

}
