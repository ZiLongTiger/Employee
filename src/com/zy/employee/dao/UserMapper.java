package com.zy.employee.dao;

import org.apache.ibatis.annotations.Param;

import com.zy.employee.entity.User;

public interface UserMapper {

	public User getUser(@Param(value="name")String name,@Param(value="password")String password);
	
	public int insertUser(User user);
}
