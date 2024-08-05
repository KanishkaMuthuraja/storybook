package com.example.demo.modal;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    public String name;
    public String email;
    public int password;
    public User(String name, String email, int password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    
}

