package com.liu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@RestController
public class Hello2Controller {

	@RequestMapping("/hellotwo")
	public String hello(){
		return "hello00";
	}
}
