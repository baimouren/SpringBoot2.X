package com.boot.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.mapper.UserMapper;
import com.boot.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<Map<String, Object>> query(Map<String, String> map) {
		List<Map<String, Object>> queryList = userMapper.query(map);
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
	public int save(List<Map<String, Object>> list) {
		int save = userMapper.save(list);
		return save;
	}

}
