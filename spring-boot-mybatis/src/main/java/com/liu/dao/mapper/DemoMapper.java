package com.liu.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.liu.domain.Demo;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月8日
 */
public interface DemoMapper {

	@Select("select * from Demo where name like #{name}")
	public List<Demo> likeName(String name);
	
	@Select("select * from Demo where id = #{id}")
	public Demo getById(Long id);
	
	@Select("select name from Demo where id = #{id}")
	public String getNameById(Long id);
	
	@Insert("insert into Demo(name) values(#{name})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public void save(Demo demo);
}
