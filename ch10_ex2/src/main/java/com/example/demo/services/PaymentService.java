package com.example.demo.services;

import com.example.demo.exceptions.NotEnoughMoneyException;
import com.example.demo.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
