package com.example.lookbilibili.mapper.security;

import com.example.lookbilibili.domain.security.SysUserRole;

/**
 * @Description
 * @Auther CB
 * @Date 2019-07-10 10:44
 * @Version 1.0
 **/
public interface SysUserRoleMapper {

    public SysUserRole findRolesByCode(String userCode);
}
