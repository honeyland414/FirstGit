package com.example.firstgitdemo.service;

import com.example.firstgitdemo.dao.UserDao;
import com.example.firstgitdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.gerAllUsers();
    }

    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
