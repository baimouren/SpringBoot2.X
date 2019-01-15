package com.boot.demo.controller.pg;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author CB
 * @date:   2018年12月19日 下午3:46:52
 */
@SpringBootApplication
@ComponentScan("com.boot.demo.*")
@MapperScan("com.boot.demo.mapper")
@Controller
public class PgController {
	private static final Logger logger = LoggerFactory.getLogger(PgController.class);
	
	@RequestMapping(value="{/,/index,index.html}",method = RequestMethod.GET)
	public String index(@PathVariable String pg) {
		logger.info("页面名："+ pg );
		return "index";
	}
	
	@RequestMapping(value="/pg/{pg}",method = RequestMethod.GET)
	public String pg(@PathVariable String pg) {
		logger.info("页面名："+ pg );
		return pg;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PgController.class, args);
	}

}
