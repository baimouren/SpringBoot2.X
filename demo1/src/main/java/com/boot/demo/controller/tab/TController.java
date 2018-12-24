package com.boot.demo.controller.tab;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.demo.controller.base.BaseController;
import com.boot.demo.service.common.CommonService;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:46:05
 */
@RequestMapping("/t")
@Controller
public class TController extends BaseController{
	private static final Logger logger = LoggerFactory.getLogger(TController.class);
	
	@Autowired
	private CommonService commonService;
	
	@ResponseBody
	@RequestMapping("/query/{tab}")
	public List<Object> queryTab(HttpServletRequest request,HttpServletResponse response,@PathVariable String tab){
        logger.info(tab);
		List<Object> list = commonService.query(tab);
		return list;
	}
	
}
