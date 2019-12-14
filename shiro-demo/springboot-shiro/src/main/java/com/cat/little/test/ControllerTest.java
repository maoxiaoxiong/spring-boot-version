package com.cat.little.test;


import com.cat.little.service.UserService;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class ControllerTest {

    @Autowired
    private UserService userService;


    @GetMapping("/hello")
    public String test() {

        return "hello controller";
    }


    @GetMapping("/add")
    public String add() {

        return "user/add";
    }


    @GetMapping("/update")
    public String update() {

        return "user/update";
    }


    @GetMapping("/toLogin")
    public String tologin() {

        return "/login";
    }

    @GetMapping("th")
    public String testTh(Model model) {

        model.addAttribute("name", "hello");
        return "test";
    }

    @GetMapping("noAuth")
    public String noAuth(Model model) {

        model.addAttribute("name", "hello");
        return "noAuth";
    }


    @PostMapping("/login")
    public String tologin(@RequestParam Map<String, Object> map, Model model) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upt = new UsernamePasswordToken((String) map.get("name"), (String) map.get("password"));
        try {
            subject.login(upt);
        } catch (UnknownAccountException e) {
//            userService.findByName("");
            model.addAttribute("msg", "用户error");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码error");
            return "login";
        }

        return "redirect:/th";
    }
}
