package com.liu.demo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.demo.bean.Cat;
import com.liu.demo.dao.CatDao;
import com.liu.demo.repository.Cat2Repository;
import com.liu.demo.repository.Cat3Repository;
import com.liu.demo.repository.CatRepository;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@Service
public class CatService {

	@Resource
	private CatRepository catRepository;
	@Autowired
	private Cat2Repository cat2Repository;
	@Autowired
	private Cat3Repository cat3Repository;
	@Autowired
	private CatDao catDao;

	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}

	@Transactional
	public void delete(Long id) {
		catRepository.delete(id);
	}

	public Iterable<Cat> getAll() {
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName){
		return cat2Repository.findByCatName(catName);
	}
	
	public Cat findByCatNameLike(String catName){
		return cat2Repository.findByCatNameLike("%"+catName+"%");
	}
	
	public Cat selectByCatName(String catName){
		return catDao.selectByCatName(catName);
	}
}
