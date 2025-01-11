package com.shahariyr.blogify.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shahariyr.blogify.payloads.UserDto;
import com.shahariyr.blogify.repository.UserRepo;
import com.shahariyr.blogify.services.UserService;

public class UserSecviceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDto createUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}

}
