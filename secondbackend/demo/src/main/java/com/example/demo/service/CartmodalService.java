// CartmodalService.java
package com.example.demo.service;

import com.example.demo.modal.Cartmodal;
import com.example.demo.repository.Cartrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartmodalService {

    @Autowired
    private Cartrepository cartmodalRepository;

    public List<Cartmodal> getAllCartmodals() {
        return cartmodalRepository.findAll();
    }

    public Optional<Cartmodal> getCartmodalById(int id) {
        return cartmodalRepository.findById(id);
    }

    public Cartmodal addCartmodal(Cartmodal cartmodal) {
        return cartmodalRepository.save(cartmodal);
    }

    public Cartmodal updateCartmodal(int id, Cartmodal cartmodalDetails) {
        Cartmodal cartmodal = cartmodalRepository.findById(id).orElseThrow(() -> new RuntimeException("Cartmodal not found"));
        
        cartmodal.setName(cartmodalDetails.getName());
        cartmodal.setPrice(cartmodalDetails.getPrice());
        
        return cartmodalRepository.save(cartmodal);
    }

    public void deleteCartmodal(int id) {
        cartmodalRepository.deleteById(id);
    }
}
