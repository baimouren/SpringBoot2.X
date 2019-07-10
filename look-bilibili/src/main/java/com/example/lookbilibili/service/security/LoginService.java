package com.example.lookbilibili.service.security;

import org.springframework.stereotype.Service;

/**
 * @Description
 * @Auther CB
 * @Date 2019-06-25 10:36
 * @Version 1.0
 **/
public interface LoginService {

    public String login(String userName,String userPassword);
}
