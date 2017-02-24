package com.nayou.backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nayou.backend.model.User;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	List<User> findAll();

	User findByUserName(String userName);

	User findByUserId(Long userId);

	User save(User user);
	
	void delete(User user);

}
