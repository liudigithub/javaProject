package com.liu.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.liu.demo.bean.Cat;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
@Repository
public class CatDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Cat selectByCatName(String catName) {
		String sql = "select * from cat where cat_name = ?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[] { catName },
				rowMapper);
		return cat;
	}
}
