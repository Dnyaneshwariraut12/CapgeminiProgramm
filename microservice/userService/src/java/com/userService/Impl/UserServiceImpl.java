package com.userService.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userService.Entity.User;
import com.userService.Exception.ResourceNotFoundException;
import com.userService.Repository.UserRepository;
import com.userService.Service.UserService;


@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepository  userRepository ;

	@Override	
	public User saveUser(User user) {
		
		//generate unique userid
		
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("Use with given id is not found on server !! :"+userId));
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


}