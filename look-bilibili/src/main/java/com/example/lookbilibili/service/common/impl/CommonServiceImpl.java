package com.example.lookbilibili.service.common.impl;


import com.example.lookbilibili.mapper.common.CommonMapper;
import com.example.lookbilibili.service.common.CommonService;
import com.example.lookbilibili.utils.StringCamelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 公共service 对表执行CRUD基本操作
 * @author CB
 * @date:   2018年12月19日 下午3:47:22
 */

@Service("commonService")
public class CommonServiceImpl implements CommonService {
	private static final Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

	@Autowired
	private CommonMapper commonMapper;

	@Override
	public List<Object> query(String tab, Map<String,Object> wdata) {
		List<Object> list = new ArrayList<>();
		try {
			String pStr = " limit ";
			StringBuffer sqlbuffer = new StringBuffer();
			sqlbuffer.append(" select * from " + tab + " where 1=1 ");

			if(null != wdata.get("data")){
				Map<String,Object> pMap = (Map<String,Object>)wdata.get("data");
				for (String key:pMap.keySet()) {
					sqlbuffer.append(" and "+ StringCamelUtil.camel2Underline(key) +" = \""+ pMap.get(key) +"\"");
				}
			}
			if(null != wdata.get("pageNo"))
				pStr =pStr + wdata.get("pageNo").toString() +",";
			if (null != wdata.get("limit")){
				pStr = pStr + wdata.get("limit").toString();
			}else {
				pStr = pStr + "10";
			}
			sqlbuffer.append(pStr);
			List<Object> queryList = commonMapper.query(sqlbuffer.toString());
			for (Object o:queryList) {
				Map<String,String> map = (Map<String,String>)o;
				Map<String,Object> retMap = new HashMap<String,Object>();
				for (String key:map.keySet()) {
					retMap.put(StringCamelUtil.underline2Camel(key), map.get(key));
				}
				list.add(retMap);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			list.add("sql执行异常");
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
