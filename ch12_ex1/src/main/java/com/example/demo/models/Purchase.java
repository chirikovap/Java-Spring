package com.example.demo.models;

import java.math.BigDecimal;

public class Purchase {
    private int id;
    private String product;
    private Double price;

    public void setId(int id) {
        this.id = id;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public int getId() {
        return id;
    }
}

