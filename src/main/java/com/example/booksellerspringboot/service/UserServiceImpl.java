package com.example.booksellerspringboot.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.booksellerspringboot.entity.Role;
import com.example.booksellerspringboot.entity.User;
import com.example.booksellerspringboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreatedTime(LocalDateTime.now());
        user.setUpdatedTime(LocalDateTime.now());
        this.userRepository.saveUser(user);
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return this.userRepository.getUserByUserName(userName);
    }

    @Override
    @Transactional
    public void deleteUser(String userId) {
        this.userRepository.deleteUser(userId);
    }
}
