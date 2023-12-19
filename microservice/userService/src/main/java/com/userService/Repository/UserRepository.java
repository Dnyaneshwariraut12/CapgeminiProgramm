package com.userService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userService.Entity.User;

public interface UserRepository extends JpaRepository<User, String>{

	
}
