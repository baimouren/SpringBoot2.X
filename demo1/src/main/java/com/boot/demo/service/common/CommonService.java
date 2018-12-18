package com.boot.demo.service.common;

import java.util.List;
import java.util.Map;

/**
 * 
 * @Description:公共类
 * @author CB
 * @date:   2018年12月18日 下午9:45:25
 */
public interface CommonService {
	
	/**
	 * @Description: 公共查询方法
	 * @param sql
	 * @return
	 */
	public List<Map<String,Object>> query(String sql);
	
	/**
	 * @Description: 公共增删改方法
	 * @param list
	 * @return
	 */
	public int save(List<Map<String,Object>> list);
}
