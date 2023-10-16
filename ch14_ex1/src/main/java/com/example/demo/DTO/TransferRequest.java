package com.example.demo.DTO;

import java.math.BigDecimal;

public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setSenderAccountId(long senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public void setReceiverAccountId(long receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public long getSenderAccountId() {
        return senderAccountId;
    }

    public long getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
