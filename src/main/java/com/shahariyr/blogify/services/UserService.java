package com.shahariyr.blogify.services;

import java.util.List;

import com.shahariyr.blogify.payloads.UserDto;

public interface UserService {

	UserDto createUser (UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUser();
	void deleteUser(Integer userId);
	
}
