package com.example.lookbilibili.service.common.impl;


import com.example.lookbilibili.domain.BaseModel;
import com.example.lookbilibili.mapper.common.CommonMapper;
import com.example.lookbilibili.service.common.CommonService;
import com.example.lookbilibili.utils.StringCamelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

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
	public BaseModel query(String tab, Map<String,Object> wdata) {
		BaseModel baseModel = new BaseModel();
		List<Object> list = new ArrayList<>();
		try {
			StringBuffer sqlbuffer = new StringBuffer();
			sqlbuffer.append(" select * from " + tab + " where 1=1 ");

			if(null != wdata.get("data") && ((List)wdata.get("data")).size() > 0 && !((List<Map>)wdata.get("data")).get(0).isEmpty()){
				List<Map<String,String>> listMap = (List<Map<String,String>>)wdata.get("data");
				for (Map<String,String> m : listMap) {
					Map<String,String> smap = (Map)m;
					sqlbuffer.append(" and "+ StringCamelUtil.camel2Underline(smap.get("col")) +smap.get("con")+ smap.get("val") );
				}
			}

			if(null != wdata.get("order")){
				List<String> orderStr = (List<String>)wdata.get("order");
				sqlbuffer.append(" order by  ");
				Boolean comma = false;
				for (String o : orderStr) {
					String smap = o;
					sqlbuffer.append(StringCamelUtil.camel2Underline(o));
					if(comma ){
						sqlbuffer.append(",");
					}
				}
			}


			Object queryCount = commonMapper.query("select Count(1) count_  from ("+sqlbuffer.toString()+") TT").get(0);

			Object pageNo = wdata.get("pageNo");
			String pStr = " limit ";
			Integer limit = 10;
			limit =Integer.valueOf(wdata.get("limit").toString());
			if(null != pageNo){
				Integer startRow = (Integer.valueOf(pageNo.toString())-1) * limit;
				pStr = pStr + startRow +",";
				baseModel.setPageNo(Integer.valueOf(pageNo.toString()));
				baseModel.setLimit(limit);
			}

			sqlbuffer.append(pStr + limit);
			List<Object> queryList = commonMapper.query(sqlbuffer.toString());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			for (Object o:queryList) {
				Map<String,String> map = (Map<String,String>)o;
				Map<String,Object> retMap = new HashMap<String,Object>();
				for (String key:map.keySet()) {
					Object tValue = map.get(key);
					if(tValue instanceof Timestamp)
						tValue = sdf.format(tValue);
					retMap.put(StringCamelUtil.underline2Camel(key), tValue);
				}
				list.add(retMap);
			}

			baseModel.setResult(list);
			baseModel.setCount(Integer.valueOf(((Map<String,Object>)queryCount).get("count_").toString()));
			return baseModel;
		} catch (Exception e) {
			e.printStackTrace();
			list.add("sql执行异常");
		}
		return baseModel;
	}

	@Override
	public int save(Map<String, Object> wdata, String tab) {
		Integer saveAmount = 0 ;
		StringBuffer sqlBuffer = new StringBuffer();
		try {
			if(null == wdata.get("rowId")) {
				sqlBuffer = sqlBuffer.append("insert into "+ tab);
				StringBuffer keyStr = new StringBuffer();
				StringBuffer valueStr = new StringBuffer();
				for (String key:wdata.keySet()) {
					keyStr.append(keyStr.length()==0?"":",").append(StringCamelUtil.camel2Underline(key));
					valueStr.append(valueStr.length()==0?"":",").append("'"+wdata.get(key)+"'");
				}
				sqlBuffer.append(" ("+keyStr.toString()+" ,revise_time,create_time) ");
				sqlBuffer.append(" values ("+valueStr.toString()+",now(),now() )");
			}else{
				sqlBuffer.append(" update "+ tab);
				sqlBuffer.append(" revise_time = now() ");
			}

			saveAmount = commonMapper.save(sqlBuffer.toString() );
		} catch (Exception e) {
			logger.error("sql执行异常");
			e.printStackTrace();
		}
		return saveAmount;
	}

	@Override
	public int remove(List<Map<String, Object>> list,String tab) {
		List<Object> removeList = null;
		StringBuffer sqlBuffer = new StringBuffer();
		try {
			for(Map<String, Object> map : list) {
				sqlBuffer = sqlBuffer.length() == 0?sqlBuffer.append(String.valueOf(map.get("rowId"))):sqlBuffer.append(","+String.valueOf(map.get("rowId")));
			}
			if(list.size() == 0){
				return 0;
			}

			String sql = "delet from "+ tab + " where row_id in ( " + sqlBuffer.toString() + " )";
			removeList = commonMapper.query(sql );
		} catch (Exception e) {
			logger.error("sql执行异常");
			e.printStackTrace();
		}
		return removeList.size();
	}

}
