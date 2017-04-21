package com.wk.dz.entity;

import java.util.Date;

public class ActContentOpt 
{
	private Integer id;
	private Integer contentId;
	private String optInfo;
	private Integer optType;
	private Date tsp;
	
	public ActContentOpt() 
	{
		super();
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

	public String getOptInfo() {
		return optInfo;
	}

	public void setOptInfo(String optInfo) {
		this.optInfo = optInfo;
	}

	public Integer getOptType() {
		return optType;
	}

	public void setOptType(Integer optType) {
		this.optType = optType;
	}

	public Date getTsp() {
		return tsp;
	}

	public void setTsp(Date tsp) {
		this.tsp = tsp;
	}
	
}
