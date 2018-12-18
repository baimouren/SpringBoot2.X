package com.boot.demo.mapper.common;

import java.util.List;
import java.util.Map;

/**
 * @Description:公共
 * @author CB
 * @date:   2018年12月18日 下午9:49:41
 */
public interface CommonMapper {
	
	public List<Map<String,Object>> query(String sql);
	
	public int save(List<Map<String,Object>> list);
}
