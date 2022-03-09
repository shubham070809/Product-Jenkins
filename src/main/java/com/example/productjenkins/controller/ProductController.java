package com.example.productjenkins.controller;

import com.example.productjenkins.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ProductController {

    //post mapping
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(Product product)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping("/products")
    public ResponseEntity<Product> getProduct()
    {
        return ResponseEntity.ok(Product.builder().productId(UUID.randomUUID().toString()).productName("Car").productPrice(1000000.0).build());
    }
}
