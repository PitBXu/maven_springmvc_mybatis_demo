package com.zheng.service;

import com.zheng.model.User;

import java.util.List;

public interface UserService {
	User selectUserById(Integer userId);

	List<User> getAll();
}
