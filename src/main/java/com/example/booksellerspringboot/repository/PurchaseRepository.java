package com.example.booksellerspringboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.booksellerspringboot.entity.Purchase;

@Repository
@Mapper
public interface PurchaseRepository {
    public void savePurchase(Purchase purchase);

    public List<Purchase> getAllPurchasesItemsOfUser(String userId);
}
