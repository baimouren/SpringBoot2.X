package com.boot.demo.controller.tab;

import java.lang.Thread.State;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.demo.controller.pg.PgController;
import com.boot.demo.service.common.CommonService;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:46:05
 */
@RequestMapping("/t")
@Controller
public class TController {
	private static final Logger logger = LoggerFactory.getLogger(PgController.class);
	
	@Autowired
	private CommonService commonService;
	
	@ResponseBody
	@RequestMapping("/query/{tab}")
	public List<Object> queryTab(HttpServletRequest request,HttpServletResponse response,@PathVariable String tab){
        logger.info(tab);
//		Map<String, String[]> parameterMap = request.getParameterMap();
		List<Object> list = commonService.query(tab);
		return list;
	}
	
}
