package com.example.firstgitdemo.controller;


import com.example.firstgitdemo.domain.Order;
import com.example.firstgitdemo.domain.User;
import com.example.firstgitdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        List<Order> orders = new ArrayList<>();
        user.setOrders(orders);
        return user;
    }
}
