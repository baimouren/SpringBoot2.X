package com.example.lookbilibili.service.security.impl;

import com.example.lookbilibili.domain.security.SysUser;
import com.example.lookbilibili.domain.security.SysUserAndRole;
import com.example.lookbilibili.domain.security.SysUserRole;
import com.example.lookbilibili.service.security.UserRoleService;
import com.example.lookbilibili.utils.MD5Util;
import com.example.lookbilibili.utils.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description s
 * @Auther CB
 * @Date 2019-07-10 09:22
 * @Version 1.0
 **/
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    // 注入服务接口
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String userCode) throws UsernameNotFoundException {
        // 获取数据库用户信息
        SysUser dbUser = userRoleService.getUserByCode(userCode);
        // 获取数据库角色信息
        List<SysUserAndRole> roleList = userRoleService.findRolesByCode(userCode);
        // 将信息转换为UserDetails对象
        return changeToUser(dbUser, roleList);
    }

    private UserDetails changeToUser(SysUser dbUser, List<SysUserAndRole> roleList) {
        // 权限列表
        List<GrantedAuthority> authorityList = new ArrayList<>();
        // 赋予查询到的角色
        for (SysUserAndRole role : roleList) {
            GrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
            authorityList.add(authority);
        }
        // 创建UserDetails对象，设置用户名、密码和权限
        UserDetails userDetails = new User(dbUser.getUserCode(), dbUser.getUserPassword(), authorityList);
        return userDetails;
    }
}
