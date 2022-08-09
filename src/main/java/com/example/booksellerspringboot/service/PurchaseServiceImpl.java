package com.example.booksellerspringboot.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.booksellerspringboot.entity.Purchase;
import com.example.booksellerspringboot.repository.PurchaseRepository;

public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;

    @Override
    public void savePurchase(Purchase purchase) {
        purchase.setPurchaseDateTime(LocalDateTime.now());
        this.purchaseRepository.savePurchase(purchase);
    }

    @Override
    public List<Purchase> getAllPurchasesItemsOfUser(String userId) {
        return purchaseRepository.getAllPurchasesItemsOfUser(userId);
    }
    
}
