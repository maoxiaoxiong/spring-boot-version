package com.boot.two.two.version.controller;

import com.boot.two.two.version.config.ConfigComValue;
import com.boot.two.two.version.config.ListPropConfPrefix;
import com.boot.two.two.version.config.PropConf;
import com.boot.two.two.version.config.PropConfPrefix;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RequestMapping("/properties")
@Api(value = "测试", description = "测试Controller", tags = "测试外部配置文件控制类")
public class TestPropController {

    @Value("${configcomvalue}")
    private String configcomvalue;

    @Value("${randomValue}")
    private String randomValue;

    @Value("${randomString}")
    private String randomString;

    @Value("${myValue}")
    private String myValue;

    @Resource
    private Environment environment;

    @Autowired
    private ConfigComValue configComValue;

    @Autowired
    private PropConf propConf;

    @Autowired
    private PropConfPrefix propConfPrefix;

    @Autowired
    private ListPropConfPrefix listPropConfPrefix;

    @ApiOperation(value = "ComponentAndValue", notes = "获取configcomvalue值", httpMethod = "GET")
    @GetMapping("/componentAndValue")
    public String getConfigcomvalue() {
        return configcomvalue;
    }

    @ApiOperation(value = "ConfigComValue", notes = "获取ConfigComValue值", httpMethod = "GET")
    @GetMapping("/ConfigComValue")
    public String getConfigComValue() {
        return configComValue.test();
    }

    @ApiOperation(value = "random", notes = "获取random值", httpMethod = "GET")
    @GetMapping("/random")
    public String getRandom() {
        return randomValue + "\r\n" + randomString + "\r\n" + myValue;
    }

    @ApiOperation(value = "Environment", notes = "获取ConfigComValue值", httpMethod = "GET")
    @GetMapping("/Environment")
    public String getEnvironment() {
        return environment.getProperty("configcomvalue");
    }

    @ApiOperation(value = "PropConf", notes = "获取PropConf值", httpMethod = "GET")
    @GetMapping("/PropConf")
    public void getPropertySource() {
        propConf.show();
    }

    @ApiOperation(value = "PropConfPrefix", notes = "获取PropertySource值", httpMethod = "GET")
    @GetMapping("/PropConfPrefix")
    public void getPropConfPrefix() {
        propConfPrefix.show();
    }

    @ApiOperation(value = "ListPropConfPrefix", notes = "获取ListPropConfPrefix值", httpMethod = "GET")
    @GetMapping("/ListPropConfPrefix")
    public void getListPropConfPrefix() {
        listPropConfPrefix.getHost();
    }

}
