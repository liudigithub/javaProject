package com.liu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.demo.bean.Cat;
import com.liu.demo.service.CatService;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@RestController
@RequestMapping("/cat")
public class CatController {

	@Autowired
	private CatService catService;

	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setCatName("jack");
		cat.setCatAge(18);
		catService.save(cat);
		return "save ok";
	}

	@RequestMapping("/delete")
	public String delete() {
		catService.delete(1L);
		return "delete ok";
	}

	@RequestMapping("/getAll")
	public Iterable<Cat> getAll() {
		return catService.getAll();
	}
	
	@RequestMapping("/findByCatName")
	public Cat findByCatName(String catName) {
		return catService.findByCatName(catName);
	}
	
	@RequestMapping("/findByCatNameLike")
	public Cat findByCatNameLike(String catName) {
		return catService.findByCatNameLike(catName);
	}
	
	@RequestMapping("/selectByCatName")
	public Cat selectByCatName(String catName) {
		return catService.selectByCatName(catName);
	}
}
