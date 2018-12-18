package com.boot.demo.mapper;

import java.util.List;
import java.util.Map;

public interface BaseMapper {

	public List<Map<String,Object>> query(Map<String,String> map);
	
	public int add(List<Map<String,Object>> list);
	
	public int delet(Map<String,String> map);
	
	public int save(List<Map<String,Object>> list);
}
