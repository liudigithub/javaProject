package com.liu.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.liu.demo.bean.Cat;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
public interface Cat3Repository extends PagingAndSortingRepository<Cat, Long> {

}
