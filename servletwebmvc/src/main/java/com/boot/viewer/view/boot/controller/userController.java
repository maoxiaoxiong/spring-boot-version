package com.boot.viewer.view.boot.controller;

import com.boot.viewer.view.boot.javabean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.boot.viewer.view.boot.controller
 * @date 2019/10/20 3:45 PM
 * @ClassName userController
 */
@Controller
public class userController {

    /**
     * 整合JSP技术
     *
     * @param model
     * @return
     */
    @RequestMapping("/showUser")
    public String showUser(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1, "张三", 20));
        list.add(new Users(2, "李四", 22));
        list.add(new Users(3, "王五", 24));


        model.addAttribute("list", list);


        return "userList";
    }

    /**
     * 整合Thymeleaf
     *
     * @param model
     * @return
     */
    @RequestMapping("/show")
    public String showInfo(Model model) {
        model.addAttribute("msg", "Thymeleaf 第一个案例");
        return "index";
    }


    @RequestMapping("/showUserf")
    public String showUsers(Model model) {
        List<Users> list = new ArrayList<>();
        list.add(new Users(1, "张三", 20));
        list.add(new Users(2, "李四", 22));
        list.add(new Users(3, "王五", 24));


        model.addAttribute("list", list);


        return "userListFree";
    }


}
