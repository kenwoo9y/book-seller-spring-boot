package com.example.booksellerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booksellerspringboot.entity.Purchase;
import com.example.booksellerspringboot.service.PurchaseService;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        purchaseService.savePurchase(purchase);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
