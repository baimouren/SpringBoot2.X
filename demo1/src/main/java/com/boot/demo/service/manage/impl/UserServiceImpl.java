package com.boot.demo.service.manage.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.mapper.manage.UserMapper;
import com.boot.demo.model.UserModel;
import com.boot.demo.service.manage.UserService;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:46:19
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int add(List<Map<String, Object>> list) {
		int add = userMapper.add(list);
		return add;
	}

	@Override
	public int remove(Map<String, String> map) {
		int delet = userMapper.remove(map);
		return delet;
	}

	@Override
	public int replace(List<Map<String, Object>> list) {
		int save = userMapper.replace(list);
		return save;
	}

	@SuppressWarnings("hiding")
	@Override
	public <UserModel> List<UserModel> query(Map<String, Object> map) {
		List<UserModel> queryList = userMapper.query(map);
		return queryList;
	}

}
