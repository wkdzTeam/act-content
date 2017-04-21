package com.wk.dz.entity;

import java.util.Date;

public class ActRef 
{
	private Integer id;
	private Integer contentId;
	private Integer contentOptId;
	private Integer userId;
	private Date tsp;
	
	public ActRef() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public Integer getContentOptId() {
		return contentOptId;
	}
	public void setContentOptId(Integer contentOptId) {
		this.contentOptId = contentOptId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getTsp() {
		return tsp;
	}
	public void setTsp(Date tsp) {
		this.tsp = tsp;
	}
	
	
	
}
