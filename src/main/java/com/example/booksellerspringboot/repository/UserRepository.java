package com.example.booksellerspringboot.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.booksellerspringboot.entity.User;

@Repository
@Mapper
public interface UserRepository {
    public User saveUser();

    public Optional<User> getUserByUserName(String userName);
}
