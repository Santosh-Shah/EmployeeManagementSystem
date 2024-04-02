package com.empmngt.controller;

import com.empmngt.entity.User;
import com.empmngt.service.UserService;
import com.empmngt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestParam String username, @RequestParam String password) {
        return userService.getUserByUsernameAndPassword(username, password);
    }

    @GetMapping("/allusers")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    // Implement CRUD operations as needed
}