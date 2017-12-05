package com.liu.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.liu.demo.bean.Cat;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
public interface CatRepository extends CrudRepository<Cat, Long> {

}
