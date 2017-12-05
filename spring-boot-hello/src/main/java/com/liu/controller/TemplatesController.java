package com.liu.controller;

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
@RequestMapping("/templates")
public class TemplatesController {

	
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){
//		ModelAndView model = new ModelAndView("hello");
		map.put("name", "temp");
		return "hello";
	}
	
	@RequestMapping("/helloFtl")
	public String helloFtl(Map<String,Object> map){
//		ModelAndView model = new ModelAndView("hello");
		map.put("name", "free");
		return "helloFtl";
	}
}
