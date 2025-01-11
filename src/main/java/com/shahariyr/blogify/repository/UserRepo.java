package com.shahariyr.blogify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahariyr.blogify.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
