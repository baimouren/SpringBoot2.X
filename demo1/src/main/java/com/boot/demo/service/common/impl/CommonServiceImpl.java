package com.boot.demo.service.common.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.mapper.common.CommonMapper;
import com.boot.demo.service.common.CommonService;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:47:22
 */
@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CommonMapper commonMapper;
	
	@Override
	public List<Object> query(String tab) {
		List<Object> list = null;
		try {
			String sql = "select * from "+tab+" limit 1 ";
			list = commonMapper.query(sql);
			return list;
		} catch (Exception e) {
			list.add("查询异常");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int save(List<Map<String, Object>> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
