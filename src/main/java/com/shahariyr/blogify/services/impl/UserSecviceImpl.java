package com.shahariyr.blogify.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shahariyr.blogify.entities.User;
import com.shahariyr.blogify.payloads.UserDto;
import com.shahariyr.blogify.repository.UserRepo;
import com.shahariyr.blogify.services.UserService;

public class UserSecviceImpl implements UserService {

	@Autowired
	private UserRepo userRepo; 
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.dtoToUser(userDto);
		User savedUser = userRepo.save(user);
		return this.userToDto(savedUser);
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
	
	public User dtoToUser (UserDto userDto) {
		
		User user = new User();
		
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		
		return user;
	}
	
	public UserDto userToDto (User user) {
		
		UserDto userDto = new UserDto();
		
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setAbout(user.getAbout());
		userDto.setPassword(user.getPassword());
		
		return userDto;
	}
	

}
