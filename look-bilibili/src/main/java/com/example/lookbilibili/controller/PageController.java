package com.example.lookbilibili.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-20 20:00
 * @Version 1.0
 **/
@Controller
public class PageController {

    @RequestMapping("/index")
    public String getPage(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "loclahost");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

}
