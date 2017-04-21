package com.wk.dz.dao;

import com.wk.dz.entity.ActUser;

public interface UserMapper 
{
	ActUser getUserByName(String name);
	
	ActUser getUserById(Integer id);
	
	void insertUser(ActUser user);
	
}
