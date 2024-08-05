package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Bookmodal;

public interface Bookrepository extends JpaRepository<Bookmodal,Integer>{
    
}
