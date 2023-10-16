package com.example.demo.controllers;

import com.example.demo.DTO.TransferRequest;
import com.example.demo.models.Account;
import com.example.demo.services.TransferService;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;

@RestController
public class AccountController {
    private final TransferService transferService;
    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request ) throws AccountNotFoundException {
        transferService.transferMoney( request.getSenderAccountId(), request.getReceiverAccountId(), request.getAmount());
    }
    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name ) {
        if (name == null) {
            return transferService.getAllAccounts();
        }
        else {
            return transferService.findAccountsByName(name);
        }
    }
}
