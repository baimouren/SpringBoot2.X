package com.boot.demo.controller.manage;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.controller.base.BaseController;
import com.boot.demo.service.manage.WorkLogService;

@RestController
@RequestMapping("/work")
public class WorkLogController extends BaseController{
	
	@Autowired
	private WorkLogService workLogService;
	
	@RequestMapping("/queryWorkLog")
	public List<Object> queryWorkLog(HttpServletRequest request,HttpServletResponse response) {
		Map<String, Object> paramMap = getParamMap(request, response);
		List<Object> query = workLogService.query(paramMap);
		return query;
	}
	
}
