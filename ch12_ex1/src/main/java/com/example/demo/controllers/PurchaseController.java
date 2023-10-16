package com.example.demo.controllers;

import com.example.demo.models.Purchase;
import com.example.demo.repositories.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;
    public PurchaseController( PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository; }
    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }
    @GetMapping
    public List<Purchase> findPurchases() {
        return purchaseRepository.findAllPurchases();
    }
}