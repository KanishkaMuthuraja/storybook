// CartmodalController.java
package com.example.demo.controller;

import com.example.demo.modal.Cartmodal;
import com.example.demo.service.CartmodalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartmodals")
public class CartmodalController {

    @Autowired
    private CartmodalService cartmodalService;

    @GetMapping
    public List<Cartmodal> getAllCartmodals() {
        return cartmodalService.getAllCartmodals();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cartmodal> getCartmodalById(@PathVariable int id) {
        return cartmodalService.getCartmodalById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cartmodal addCartmodal(@RequestBody Cartmodal cartmodal) {
        return cartmodalService.addCartmodal(cartmodal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cartmodal> updateCartmodal(@PathVariable int id, @RequestBody Cartmodal cartmodalDetails) {
        return ResponseEntity.ok(cartmodalService.updateCartmodal(id, cartmodalDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCartmodal(@PathVariable int id) {
        cartmodalService.deleteCartmodal(id);
        return ResponseEntity.noContent().build();
    }
}

