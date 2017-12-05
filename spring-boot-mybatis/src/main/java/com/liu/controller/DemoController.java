package com.liu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.liu.domain.Demo;
import com.liu.service.DemoService;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/likeName")
	public List<Demo> likeName(String name) {
		PageHelper.startPage(1, 2);
		return demoService.likeName(name);
	}
	
	@RequestMapping("/getById")
	public Demo getById(Long id) {
		return demoService.getById(id);
	}
	
	@RequestMapping("/save")
	public String save() {
		Demo demo = new Demo();
		demo.setName("cc");
		demoService.save(demo);
		return "success";
	}
	
}
