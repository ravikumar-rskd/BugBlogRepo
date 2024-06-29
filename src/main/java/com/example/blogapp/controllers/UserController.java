package com.example.blogapp.controllers;

import com.example.blogapp.models.User;
import com.example.blogapp.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @PostMapping
    public User createUser(User user) {
        return userService.createUser(user);
    }
    @GetMapping
    public ResponseEntity List<User> getUsers() {
        List<User> user = userService.getUsers();
        return ResponseEntity.ok(user);
    }


    // Other endpoints for user management
}