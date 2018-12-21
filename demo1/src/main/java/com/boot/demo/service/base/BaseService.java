package com.boot.demo.service.base;

import java.util.List;
import java.util.Map;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:47:14
 */
public interface BaseService {

	public <T> List<T> select(Map<String,String> map);
	
	public int add(List<Map<String,Object>> list);
	
	public int delet(Map<String,String> map);
	
	public int update(List<Map<String,Object>> list);
}
