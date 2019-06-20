package com.example.lookbilibili.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther CB
 * @Date 2019-06-20 16:42
 * @Version 1.0
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

}
