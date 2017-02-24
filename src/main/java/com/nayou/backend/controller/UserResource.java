package com.nayou.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nayou.backend.model.User;
import com.nayou.backend.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserResource {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/users")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @RequestMapping(value = "/user/userName", method = RequestMethod.POST)
    public User findByUserName(@RequestBody String userName) {
        System.out.println("findByUserName -> Username : " + userName);
        return userService.findByUserName(userName);
    }
    
    @RequestMapping(value = "/user/id", method = RequestMethod.POST)
    public User findById(@RequestBody Long id) {
        System.out.println("findById -> User Id : "+ id);
        return userService.findByUserId(id);
    }
    

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public User updateUser(@RequestBody User user) {
    	System.out.println("UpdateUser -> User Id : " + user.getUserId());
    	System.out.println("UpdateUser -> Username : " + user.getUserName());
        return userService.save(user);
    }
    
    @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user) {
    	System.out.println("DeleteUser -> User Id : " + user.getUserId());
    	System.out.println("DeleteUser -> Username : " + user.getUserName());
        userService.delete(user);
    }
    
}