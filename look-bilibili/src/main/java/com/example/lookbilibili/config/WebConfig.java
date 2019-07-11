package com.example.lookbilibili.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    // 增加映射关系
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        // 突破 configure(HttpSecurity http)  没有配置 /index 导致无法访问的问题
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/logout").setViewName("logout");
    }
}