package com.boot.demo.controller.base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController{
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	protected static Map<String,Object> getParamMap(HttpServletRequest request,HttpServletResponse response) {
			Map<String, String[]> parameterMap = request.getParameterMap();
			Map<String, Object> pMap = new HashMap<>();
			pMap.put("limit", 100);
			
			try {
				for(String m : parameterMap.keySet()) {
					String[] param = parameterMap.get(m);
					if(param.length == 1) {
						pMap.put(m, param[0]);
					}else if(param.length > 1){
						List<String> asList = Arrays.asList(param);
						pMap.put(m, asList);
					}
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			logger.info(pMap.toString());
			return pMap;
	}
	
}
