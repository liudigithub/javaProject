package com.example.demo.serice.feign.hystrix;

import org.springframework.stereotype.Component;

import com.example.demo.serice.feign.service.SchedualServiceHi;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月23日
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
