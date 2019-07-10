package com.example.lookbilibili.mapper.security;

import com.example.lookbilibili.domain.security.SysUserAndRole;
import com.example.lookbilibili.domain.security.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Auther CB
 * @Date 2019-07-10 10:44
 * @Version 1.0
 **/
@Repository
public interface SysUserRoleMapper {

    public List<SysUserAndRole> findRolesByCode(String userCode);
}
