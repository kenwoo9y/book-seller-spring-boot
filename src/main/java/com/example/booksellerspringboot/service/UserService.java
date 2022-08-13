package com.example.booksellerspringboot.service;

import java.util.Optional;

import com.example.booksellerspringboot.entity.User;

public interface UserService {
    void saveUser(User user);

    Optional<User> getUserByUserName(String userName);

    void deleteUser(String userId);
}
