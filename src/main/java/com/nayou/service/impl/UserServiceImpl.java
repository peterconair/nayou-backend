package com.nayou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nayou.dao.UserDao;
import com.nayou.model.User;
import com.nayou.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> findAllUsers() {
		return userDao.findAll();
	}

	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}
	
	public User findByUserId(Long userId) {
		return userDao.findByUserId(userId);
	}

	public User save(User user) {
		return userDao.save(user);
	}
	
	public void delete(User user) {
		 userDao.delete(user);
	}
}
