package com.example.lookbilibili.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-20 17:12
 * @Version 1.0
 **/

// SpringJUnit4ClassRunner.class, SpringRunner.class 继承前者,两个可以随意调换,没有区别
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogPropertiesTest {

    private static final Logger logger = LoggerFactory.getLogger(BlogPropertiesTest.class);

    @Autowired
    private BlogProperties blogProperties;


    @Test
    public void getHello() throws Exception {
        logger.error("\r\n"+blogProperties.toString());

        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot");
        Assert.assertEquals(blogProperties.getName(), "D-D");
    }

}