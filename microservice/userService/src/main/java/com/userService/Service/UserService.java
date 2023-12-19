package com.userService.Service;

import java.util.List;

import com.userService.Entity.User;

public interface UserService {

//	user operation
	
	//create
	
 
	User saveUser(User user);
	
	//get All User
	List<User> getAllUser();
	
	//get single user by id
	
	User getUser(String userId);

	

	

	User delete(User user);

	
}
