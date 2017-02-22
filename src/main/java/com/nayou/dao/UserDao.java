package com.nayou.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.nayou.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	List<User> findAll();

	User findByUserName(String userName);

	User findByUserId(Long userId);

	User save(User user);
	
	void delete(User user);

}
