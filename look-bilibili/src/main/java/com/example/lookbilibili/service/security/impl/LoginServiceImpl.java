package com.example.lookbilibili.service.security.impl;

import com.example.lookbilibili.domain.security.SysUser;
import com.example.lookbilibili.mapper.security.SysUserMapper;
import com.example.lookbilibili.service.security.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    private SysUserMapper sysUserMapper;

    @Override
    public String login(String userName, String userPassword) {

        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(userPassword))
            return "login";

        SysUser user = new SysUser();
        user.setUserCode(userName);
        user.setUserPassword(userPassword);

        List userList = sysUserMapper.getUser(user);
        if(userList.size()>0)
            return "hello";
        else
            return "login";
    }
}
