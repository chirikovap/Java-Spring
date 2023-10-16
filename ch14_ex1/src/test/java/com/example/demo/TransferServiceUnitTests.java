package com.example.demo;

import com.example.demo.interfaces.AccountRepository;
import com.example.demo.models.Account;
import com.example.demo.services.TransferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class TransferServiceUnitTests {
    @Test
    @DisplayName("Test the amount is transferred " + "from one account to another if no exception occurs.")
    public void moneyTransferHappyFlow() throws AccountNotFoundException {
        AccountRepository accountRepository = mock(AccountRepository.class);
        TransferService transferService = new TransferService(accountRepository);
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));
        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));
        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));
        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));
        transferService.transferMoney(
                sender.getId(),
                destination.getId(),
                new BigDecimal(100) );
        verify(accountRepository)
                .changeAmount(1, new BigDecimal(900));
        verify(accountRepository)
                .changeAmount(2, new BigDecimal(1100));
    }
    @Mock
    private AccountRepository accountRepository;
    @InjectMocks
    private TransferService transferService;
    @Test public void moneyTransferDestinationAccountNotFoundFlow() {
        Account sender = new Account();
        sender.setId(1); sender.setAmount(new BigDecimal(1000));
        given(accountRepository.findById(1L))
                .willReturn(Optional.of(sender));
        given(accountRepository.findById(2L))
                .willReturn(Optional.empty());
        assertThrows( AccountNotFoundException.class,
                () -> transferService.transferMoney(1, 2, new BigDecimal(100)) );
        verify(accountRepository, never())
                .changeAmount(anyLong(), any());
    }
}