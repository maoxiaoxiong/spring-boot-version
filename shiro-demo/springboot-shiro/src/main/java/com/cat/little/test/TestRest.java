package com.cat.little.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {


    @GetMapping("/haha")
    public String haha() {
        return "wahaha";
    }
}


