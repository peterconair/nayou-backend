package com.nayou.service;

import java.util.List;

import com.nayou.model.User;

public interface UserService {

	List<User> findAllUsers();

	User findByUserName(String userName);
	
	User findByUserId(Long id);
    void delete(User user);
	User save(User user);

}
