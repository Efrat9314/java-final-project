package com.example.finalproject.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Creditional {
    private String email;
    private String password;

    public Creditional(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Creditional() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
