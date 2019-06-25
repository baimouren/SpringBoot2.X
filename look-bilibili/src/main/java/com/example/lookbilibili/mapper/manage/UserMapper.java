package com.example.lookbilibili.mapper.manage;


import com.example.lookbilibili.domain.manage.SysUser;
import com.example.lookbilibili.mapper.base.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:47:08
 */
@Repository
public interface UserMapper extends BaseMapper {
	public List getUser(SysUser user);
}
