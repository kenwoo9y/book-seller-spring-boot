package com.example.booksellerspringboot.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private Long id;
    private String userId;
    private String bookId;
    private Double price;
    private LocalDateTime purchaseDateTime;
}
