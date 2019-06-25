package com.example.lookbilibili.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 跳转页面
 * @Auther CB
 * @Date 2019-06-20 20:00
 * @Version 1.0
 **/
@Controller
@RequestMapping("/p")
public class PageController {

    @RequestMapping("/{pageName}")
    public String getPage(@PathVariable String pageName){
            return pageName;
    }

}
