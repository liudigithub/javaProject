package com.liu.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.domain.Demo;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月6日
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "你好";
	}
	@RequestMapping("/hello2")
	public String hello2(){
		return "hello2";
	}
	@RequestMapping("/hello3")
	public String hello3(){
		return "hello3";
	}
	
	@RequestMapping("/demo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1L);
		demo.setName("张三");
		demo.setCreateTime(new Date());
		return demo;
	}
}
