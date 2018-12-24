package com.boot.demo.mapper.base;

import java.util.List;
import java.util.Map;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:47:01
 */
public interface BaseMapper {
	
	public <T> List<T> query(Map<String,Object> map);
	
	public int add(List<Map<String,Object>> list);
	
	public int remove(Map<String,String> map);
	
	public int replace(List<Map<String,Object>> list);
}
