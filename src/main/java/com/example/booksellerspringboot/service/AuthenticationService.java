package com.example.booksellerspringboot.service;

import com.example.booksellerspringboot.entity.User;

public interface AuthenticationService {
    User signinAndReturnJwt(User user);
}
