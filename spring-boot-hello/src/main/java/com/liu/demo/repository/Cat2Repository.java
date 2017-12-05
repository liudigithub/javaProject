package com.liu.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.liu.demo.bean.Cat;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
public interface Cat2Repository extends Repository<Cat, Long>{

	public Cat findByCatName(String catName);

	@Query("from Cat where catName like :name")
	public Cat findByCatNameLike(@Param("name")String catName);
}
