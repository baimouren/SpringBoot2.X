package com.example.lookbilibili.service.security;

import com.example.lookbilibili.domain.security.SysUser;
import com.example.lookbilibili.domain.security.SysUserRole;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户及权限
 * @Auther CB
 * @Date 2019-07-10 09:24
 * @Version 1.0
 **/
public interface UserRoleService {
    public SysUser getUserByCode(String userName);

    public List<SysUserRole> findRolesByCode(String userCode);
}
