package com.empmngt.service;

import com.empmngt.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User registerUser(User user);

    Optional<User> getUser(Long id);

//    User updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUser();
}
