package com.example.booksellerspringboot.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private Role role;
    private String token;
}
