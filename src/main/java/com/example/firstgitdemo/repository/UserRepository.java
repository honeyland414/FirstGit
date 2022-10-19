package com.example.firstgitdemo.repository;

import com.example.firstgitdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
//    User findById(Integer id);
}
