package com.liu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.dao.mapper.DemoMapper;
import com.liu.domain.Demo;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;
	
	public List<Demo> likeName(String name){
		return demoMapper.likeName("%"+name+"%");
	}

	public Demo getById(Long id) {
		return demoMapper.getById(id);
	}
	
	public void save(Demo demo){
		demoMapper.save(demo);
	}
}
