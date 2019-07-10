package com.example.lookbilibili.service.security.impl;

import com.example.lookbilibili.domain.security.SysUser;
import com.example.lookbilibili.domain.security.SysUserRole;
import com.example.lookbilibili.mapper.security.SysUserMapper;
import com.example.lookbilibili.mapper.security.SysUserRoleMapper;
import com.example.lookbilibili.service.security.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Auther CB
 * @Date 2019-07-10 10:33
 * @Version 1.0
 **/
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getUserByCode(String userCode) {
        return sysUserMapper.getUserByCode(userCode);
    }

    @Override
    public List<SysUserRole> findRolesByCode(String userCode) {
        return null;
    }
}
