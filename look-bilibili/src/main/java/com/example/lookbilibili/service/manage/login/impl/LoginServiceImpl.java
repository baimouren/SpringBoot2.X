package com.example.lookbilibili.service.manage.login.impl;

import com.example.lookbilibili.domain.manage.SysUser;
import com.example.lookbilibili.mapper.manage.UserMapper;
import com.example.lookbilibili.service.manage.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Auther CB
 * @Date 2019-06-25 10:38
 * @Version 1.0
 **/
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String userName, String userPassword) {
        SysUser user = new SysUser();
        user.setUserCode(userName);
        user.setUserPassword(userPassword);

        List userList = userMapper.getUser(user);
        if(userList.size()>0)
            return "hello";
        else
            return "login";
    }
}
