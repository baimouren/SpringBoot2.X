package com.boot.demo.service.manage.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.mapper.manage.WorkLogMapper;
import com.boot.demo.model.WorkLogModel;
import com.boot.demo.service.manage.WorkLogService;

@Service("workLogService")
public class WorkLogServiceImpl implements WorkLogService {

	@Autowired
	private WorkLogMapper workLogMapper;
	
	@SuppressWarnings("hiding")
	@Override
	public <WorkLogModel> List<WorkLogModel> query(Map<String, Object> map) {
		List<WorkLogModel> queryList = workLogMapper.query(map);
		return queryList;
	}

	@Override
	public int add(List<Map<String, Object>> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int replace(List<Map<String, Object>> list) {
		// TODO Auto-generated method stub
		return 0;
	}


}
