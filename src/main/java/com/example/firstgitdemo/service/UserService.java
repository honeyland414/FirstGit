package com.example.firstgitdemo.service;

import com.example.firstgitdemo.domain.User;
import com.example.firstgitdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
//    private final UserDao userDao;
//
//    @Autowired
//    public UserService(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    public List<User> getAllUsers() {
//        return userDao.gerAllUsers();
//    }
//
//    public User getUserById(Integer id) {
//        return userDao.getUserById(id);
//    }
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }
}
