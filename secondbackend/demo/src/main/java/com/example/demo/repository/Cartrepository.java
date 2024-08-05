package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Cartmodal;

public interface Cartrepository extends JpaRepository<Cartmodal, Integer>{
    
}
