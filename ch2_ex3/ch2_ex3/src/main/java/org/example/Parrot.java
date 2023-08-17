package org.example;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";
    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
