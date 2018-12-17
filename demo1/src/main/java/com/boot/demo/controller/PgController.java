package com.boot.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class PgController {
	
	@RequestMapping(value="/{pg}",method = RequestMethod.GET)
	public String pg(@PathVariable String pg) {
		return pg;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PgController.class, args);
	}

}
