package com.wk.dz.dao;

import com.wk.dz.entity.ActContent;

public interface ActContentMapper 
{
	ActContent getContentById(Integer id);
	void insertContent(ActContent actContent);
}
