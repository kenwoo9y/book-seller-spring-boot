package com.example.booksellerspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.example.booksellerspringboot.entity.User;
import com.example.booksellerspringboot.security.UserPrincipal;
import com.example.booksellerspringboot.security.jwt.JwtProvider;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User signinAndReturnJwt(User user) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
        UserPrincipal userPrincipal = (UserPrincipal)authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrincipal);

        User signinUser = userPrincipal.getUser();
        signinUser.setToken(jwt);

        return signinUser;
    }
    
}
