package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Bookmodal;
//import com.example.demo.modal.User;
import com.example.demo.repository.Bookrepository;

@Service
public class Bookservice {

    @Autowired
    private Bookrepository bookRepository;

    // Save a new book
    public Bookmodal post(Bookmodal book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Bookmodal> getBooks() {
        return bookRepository.findAll();
    }

    // Get a book by ID
    public Optional<Bookmodal> get(Integer id) {
        return bookRepository.findById(id);
    }

    // Update a book
    public boolean update(Integer id, Bookmodal book) {
        if (!bookRepository.existsById(id)) {
            return false;
        }
        try {
            book.setId(id); // Make sure to set the ID to ensure the correct record is updated
            bookRepository.save(book);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // Delete a book
    public boolean delete(Integer id) {
        if (!bookRepository.existsById(id)) {
            return false;
        }
        bookRepository.deleteById(id);
        return true;
    }
}
