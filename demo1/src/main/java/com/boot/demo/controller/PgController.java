package com.boot.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.demo.service.manage.UserService;

@SpringBootApplication
@ComponentScan("com.boot.demo.*")
//@MapperScan("com.boot.demo.mapper")
@Controller
public class PgController {
	private static final Logger logger = LoggerFactory.getLogger(PgController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{pg}",method = RequestMethod.GET)
	public String pg(@PathVariable String pg) {
		
		Map<String, String> map = new HashMap<>();
		List<Map<String, Object>> query = userService.select(map);
		
		logger.info(query.toString());
		return pg;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PgController.class, args);
	}

}
