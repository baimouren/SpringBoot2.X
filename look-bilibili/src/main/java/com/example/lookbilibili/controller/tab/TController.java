package com.example.lookbilibili.controller.tab;


import com.example.lookbilibili.controller.base.BaseController;
import com.example.lookbilibili.service.common.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:46:05
 */
@Controller
@RequestMapping("/t")
public class TController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TController.class);
	
	@Autowired
	private CommonService commonService;
	
	@ResponseBody
	@RequestMapping("/query/{tab}")
	public List<Object> queryTab(@PathVariable String tab){
        logger.info(tab);
		List<Object> list = commonService.query(tab);
		return list;
	}
	
}
