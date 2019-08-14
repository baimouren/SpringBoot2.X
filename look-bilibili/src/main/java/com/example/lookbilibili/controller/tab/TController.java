package com.example.lookbilibili.controller.tab;


import com.example.lookbilibili.controller.base.BaseController;
import com.example.lookbilibili.service.common.CommonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
	@RequestMapping(value = "/query/{tab}", method = RequestMethod.POST)
	public List<Object> queryTab(@PathVariable String tab, @RequestBody Map<String,String> wdata){
        logger.info(tab);
		List<Object> list = commonService.query(tab,wdata);
		return list;
	}

}
