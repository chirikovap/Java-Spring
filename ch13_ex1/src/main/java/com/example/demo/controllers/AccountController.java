package com.example.demo.controllers;

import com.example.demo.DTO.TransferRequest;
import com.example.demo.models.Account;
import com.example.demo.services.TransferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final TransferService transferService;
    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request ) {
        transferService.transferMoney( request.getSenderAccountId(), request.getReceiverAccountId(), request.getAmount());
    }
    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return transferService.getAllAccounts();
    }
}
