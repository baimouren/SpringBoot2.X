package com.example.lookbilibili.service.common;

import com.example.lookbilibili.domain.BaseModel;

import java.util.List;
import java.util.Map;

/**
 *
 * @Description:公共类
 * @author CB
 * @date:   2018年12月18日 下午9:45:25
 */
public interface CommonService {

	public BaseModel query(String tab, Map<String,Object> wdata);

	public int save(Map<String, Object> wdata, String tab);

	public int remove(List<Map<String, Object>> list, String tab);
}
