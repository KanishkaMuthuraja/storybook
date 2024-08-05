package com.example.demo.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookmodal {
    @Id
    public int Book_id;
    public String Book_name;
    public String Author_name;
    public float Book_price;
    public Bookmodal(int book_id, String book_name, String author_name, float book_price) {
        Book_id = book_id;
        Book_name = book_name;
        Author_name = author_name;
        Book_price = book_price;
    }
    public int getBook_id() {
        return Book_id;
    }
    public void setBook_id(int book_id) {
        Book_id = book_id;
    }
    public String getBook_name() {
        return Book_name;
    }
    public void setBook_name(String book_name) {
        Book_name = book_name;
    }
    public String getAuthor_name() {
        return Author_name;
    }
    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }
    public float getBook_price() {
        return Book_price;
    }
    public void setBook_price(float book_price) {
        Book_price = book_price;
    }
    public void setId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
