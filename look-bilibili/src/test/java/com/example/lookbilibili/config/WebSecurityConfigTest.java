package com.example.lookbilibili.config;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-07-09 15:18
 * @Version 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WebSecurityConfigTest {

    @Value("${system.user.password.secret}")
    private String secret = null;

    @Test
    public void configure() {

        PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder(this.secret);
        String encode = passwordEncoder.encode(this.secret);
        System.out.println(encode);

    }
}