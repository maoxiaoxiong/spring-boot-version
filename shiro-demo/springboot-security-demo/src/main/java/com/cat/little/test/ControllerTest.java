package com.cat.little.test;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
//
//import com.cat.little.model.User;
//import com.cat.little.service.UserService;
//import org.apache.catalina.security.SecurityUtil;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpSession;
//import java.util.Map;
//
@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ControllerTest {
    //
//    @Autowired
//    private UserService userService;
//
//
////    @GetMapping("/hello")
////    public String test() {
////
////        return "hello controller";
////    }
////
////
    @GetMapping("/hello")
    public String add() {

        return "hello";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/role")
    public String role() {

        return "role";
    }
////
////
//
////
////    @GetMapping("th")
////    public String testTh(Model model) {
////
////        model.addAttribute("name", "hello");
////        return "test";
////    }
////
////    @GetMapping("noAuth")
////    public String noAuth(Model model) {
////
////        model.addAttribute("name", "hello");
////        return "noAuth";
////    }
//
//    @GetMapping("/login")
//    public String login() {
//
//        return "login";
//    }
//
//    @GetMapping("/logout")
//    public String logout() {
//        Subject subject = SecurityUtils.getSubject();
//        if (subject != null) {
//            subject.logout();
//        }
//        return "login";
//    }
//
//    @GetMapping("/admin")
//    @ResponseBody
//    public String admin() {
//
//        return "admin haha";
//    }
//
//    @GetMapping("/index")
//    public String index() {
//
//        return "index";
//    }
//
//
//    @RequestMapping("/loginUser")
//    public String tologin(@RequestParam Map<String, Object> map, Model model, HttpSession session) {
//
//        UsernamePasswordToken upt = new UsernamePasswordToken((String) map.get("name"), (String) map.get("password"));
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(upt);
//            Object principal = subject.getPrincipal();
//            User user = (User) subject.getPrincipal();
//            session.setAttribute("user", user);
//        } catch (UnknownAccountException e) {
////            userService.findByName("");
//            model.addAttribute("msg", "用户error");
//            return "login";
//        } catch (IncorrectCredentialsException e) {
//            model.addAttribute("msg", "密码error");
//            return "login";
//        }
//        //catch (Exception e){
//        //return "un";
//        //}
//
//        return "redirect:/index";
//    }
}
