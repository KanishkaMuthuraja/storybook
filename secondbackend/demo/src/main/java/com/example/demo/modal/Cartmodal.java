package com.example.demo.modal;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cartmodal{
    @Id
    public int id;
    public String name;
    public Double price;
    public Cartmodal(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}