package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.modal.Bookmodal;
import com.example.demo.service.Bookservice;

@RestController
@RequestMapping("/api/books")
public class Bookcontroller {

    @Autowired
    private Bookservice bookService;

    // Create a new book
    @PostMapping
    public ResponseEntity<Bookmodal> createBook(@RequestBody Bookmodal book) {
        Bookmodal createdBook = bookService.post(book);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    // Get all books
    @GetMapping
    public ResponseEntity<List<Bookmodal>> getAllBooks() {
        List<Bookmodal> books = bookService.getBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // Get a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<Bookmodal> getBookById(@PathVariable Integer id) {
        Optional<Bookmodal> book = bookService.get(id);
        if (book.isPresent()) {
            return new ResponseEntity<>(book.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update a book
    @PutMapping("/{id}")
    public ResponseEntity<Bookmodal> updateBook(@PathVariable Integer id, @RequestBody Bookmodal book) {
        boolean updated = bookService.update(id, book);
        if (updated) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a book
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Integer id) {
        boolean deleted = bookService.delete(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
