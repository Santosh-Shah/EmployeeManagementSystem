package com.empmngt.service;

import com.empmngt.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    User getUserByUsernameAndPassword(String username, String password);

    List<User> getAllUsers();
}
