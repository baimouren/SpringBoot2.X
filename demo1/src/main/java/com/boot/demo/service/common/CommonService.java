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
	
	public List<Object> query(String tab);
	
	public int save(List<Map<String,Object>> list);
}
