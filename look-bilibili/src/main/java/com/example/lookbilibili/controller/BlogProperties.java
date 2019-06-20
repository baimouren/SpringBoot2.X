package com.example.lookbilibili.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-20 17:09
 * @Version 1.0
 **/

@Component
public class BlogProperties {

    @Value("${com.didispace.blog.name}")
    private String name;

    @Value("${com.didispace.blog.title}")
    private String title;

    @Value("${com.didispace.blog.value}")
    private String value;

    @Value("${com.didispace.blog.bignumber}")
    private String bignumber;

    @Value("${com.didispace.blog.test1}")
    private String test1;

    @Value("${com.didispace.blog.test2}")
    private String test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBignumber() {
        return bignumber;
    }

    public void setBignumber(String bignumber) {
        this.bignumber = bignumber;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "BlogProperties{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", bignumber='" + bignumber + '\'' +
                ", test1='" + test1 + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }
}
