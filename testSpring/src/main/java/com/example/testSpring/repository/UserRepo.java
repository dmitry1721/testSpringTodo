package com.example.testSpring.repository;

import com.example.testSpring.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);
}
