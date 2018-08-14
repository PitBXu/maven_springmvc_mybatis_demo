package com.zheng.dao;

import com.zheng.model.User;

import java.util.List;

public interface UserDao {
	public User selectUserById(Integer userId);
	public List<User> getAll();
}
