package com.example.demo.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.io.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
	UserEntity findByUserId(String UserId);
}
