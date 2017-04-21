package com.wk.dz.entity;

import java.util.Date;

public class ActContent 
{
	private Integer id;
	private Integer sex;
	private String info;
	private Integer isAvaliable;
	private Date tsp;
	
	public ActContent() 
	{
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getIsAvaliable() {
		return isAvaliable;
	}
	public void setIsAvaliable(Integer isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
	public Date getTsp() {
		return tsp;
	}
	public void setTsp(Date tsp) {
		this.tsp = tsp;
	}
	
	
}
