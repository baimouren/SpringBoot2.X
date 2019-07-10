package com.example.lookbilibili.mapper.security;


import com.example.lookbilibili.domain.security.SysUser;
import com.example.lookbilibili.mapper.base.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @author CB
 * @date:   2018年12月19日 下午3:47:08
 */
@Repository
public interface SysUserMapper extends BaseMapper {

	public List<SysUser> getUser(SysUser user);

	public SysUser getUserByCode(String userCode);
}
