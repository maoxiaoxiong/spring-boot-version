package com.jpa.hibernate.jap.hibernate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.jpa.hibernate.jap.hibernate.controller
 * @date 2019/10/21 11:21 PM
 * @ClassName HelloController
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM sys.sys_config ", new Object[]{});
        return list;
    }
}
