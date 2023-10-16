package com.example.demo.DTO;

import java.math.BigDecimal;

public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public long getReceiverAccountId() {
        return receiverAccountId;
    }

    public long getSenderAccountId() {
        return senderAccountId;
    }

    public void setReceiverAccountId(long receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public void setSenderAccountId(long senderAccountId) {
        this.senderAccountId = senderAccountId;
    }
}
