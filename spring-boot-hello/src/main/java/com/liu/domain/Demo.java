package com.liu.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 
 * @author liudi
 * @date 2017年11月6日
 */
public class Demo {

	private Long id;
	private String name;
	@JSONField(format = "yyyy-MM-dd")
	private Date createTime;
	@JSONField(serialize = false)
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
