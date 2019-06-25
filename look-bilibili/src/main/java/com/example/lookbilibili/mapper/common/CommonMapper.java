package com.example.lookbilibili.mapper.common;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description:公共
 * @author CB
 * @date:   2018年12月18日 下午9:49:41
 */
@Repository
public interface CommonMapper {
	
	public List<Object> query(@Param(value="sql") String sql);

	public int save(List<Map<String, Object>> list);
}
