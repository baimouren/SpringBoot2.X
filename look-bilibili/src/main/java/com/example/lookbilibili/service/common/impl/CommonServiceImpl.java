package com.example.lookbilibili.service.common.impl;


import com.example.lookbilibili.mapper.common.CommonMapper;
import com.example.lookbilibili.service.common.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:47:22
 */

@Service("commonService")
public class CommonServiceImpl implements CommonService {
	private static final Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

	@Autowired
	private CommonMapper commonMapper;
	
	@Override
	public List<Object> query(String tab) {
		List<Object> list = new ArrayList<>();
		try {
			String sql = "select * from " + tab ;
			list = commonMapper.query(sql);
			return list;
		} catch (Exception e) {
			list.add("sql执行异常");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int save(List<Map<String, Object>> list, String tab) {
		List<Object> removeList = null;
		StringBuffer sqlBuffer = new StringBuffer();
		try {
			for(Map<String, Object> map : list) {
				if(null == String.valueOf(map.get("rowId"))) {
					
				}
				sqlBuffer = sqlBuffer.length() == 0?sqlBuffer.append(String.valueOf(map.get("rowId"))):sqlBuffer.append(","+String.valueOf(map.get("rowId")));
			}
			if(list.size() == 0)
			return 0;
			
			String sql = "delet from "+ tab + " where row_id in ( " + sqlBuffer.toString() + " )";
			removeList = commonMapper.query(sql );
		} catch (Exception e) {
			logger.error("sql执行异常");
			e.printStackTrace();
		}
		return removeList.size();
	}

	@Override
	public int remove(List<Map<String, Object>> list,String tab) {
		List<Object> removeList = null;
		StringBuffer sqlBuffer = new StringBuffer();
		try {
			for(Map<String, Object> map : list) {
				sqlBuffer = sqlBuffer.length() == 0?sqlBuffer.append(String.valueOf(map.get("rowId"))):sqlBuffer.append(","+String.valueOf(map.get("rowId")));
			}
			if(list.size() == 0)
			return 0;
			
			String sql = "delet from "+ tab + " where row_id in ( " + sqlBuffer.toString() + " )";
			removeList = commonMapper.query(sql );
		} catch (Exception e) {
			logger.error("sql执行异常");
			e.printStackTrace();
		}
		return removeList.size();
	}

}
