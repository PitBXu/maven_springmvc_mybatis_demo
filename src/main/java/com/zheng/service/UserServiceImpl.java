package com.zheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zheng.dao.UserDao;
import com.zheng.model.User;
import com.zheng.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }
    public List<User> getAll() {
        List<User> resultList = new ArrayList<User>();
        resultList= userDao.getAll();
          return resultList;

    }
}
