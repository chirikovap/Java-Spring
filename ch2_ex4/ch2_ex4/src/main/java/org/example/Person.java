package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Person {
    private String name = "Ella";
    private final Parrot parrot;
    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}