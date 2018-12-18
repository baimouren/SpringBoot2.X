package com.boot.demo.service.manage.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.mapper.manage.UserMapper;
import com.boot.demo.service.manage.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<Map<String, Object>> select(Map<String, String> map) {
		List<Map<String, Object>> queryList = userMapper.select(map);
		return queryList;
	}

	@Override
	public int add(List<Map<String, Object>> list) {
		int add = userMapper.add(list);
		return add;
	}

	@Override
	public int delet(Map<String, String> map) {
		int delet = userMapper.delet(map);
		return delet;
	}

	@Override
	public int update(List<Map<String, Object>> list) {
		int save = userMapper.update(list);
		return save;
	}

}
