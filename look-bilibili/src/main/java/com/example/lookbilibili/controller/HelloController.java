package com.example.lookbilibili.controller;

import com.example.lookbilibili.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther CB
 * @Date 2019-06-20 16:42
 * @Version 1.0
 **/

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/erroree")
    public String erroree() throws Exception {
        if (true)
        throw new Exception("发生错误");
        return "";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
