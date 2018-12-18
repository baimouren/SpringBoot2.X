package com.boot.demo.mapper.base;

import java.util.List;
import java.util.Map;

public interface BaseMapper {
	
	public List<Map<String,Object>> select(Map<String,String> map);
	
	public int add(List<Map<String,Object>> list);
	
	public int delet(Map<String,String> map);
	
	public int update(List<Map<String,Object>> list);
}
