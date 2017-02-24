package com.nayou.backend.service;

import java.util.List;

import com.nayou.backend.model.User;

public interface UserService {

	List<User> findAllUsers();

	User findByUserName(String userName);
	
	User findByUserId(Long id);
    void delete(User user);
	User save(User user);

}
