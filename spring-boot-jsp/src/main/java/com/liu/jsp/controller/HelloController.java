package com.liu.jsp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@Controller
public class HelloController {

	@RequestMapping("/index")
	public String index(Map<String,Object> map){
		map.put("name", "liudi");
		return "/index";
	}
}
