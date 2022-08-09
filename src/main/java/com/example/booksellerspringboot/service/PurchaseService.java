package com.example.booksellerspringboot.service;

import java.util.List;

import com.example.booksellerspringboot.entity.Purchase;

public interface PurchaseService {
    void savePurchase(Purchase purchase);

    List<Purchase> getAllPurchasesItemsOfUser(String userId);
}
