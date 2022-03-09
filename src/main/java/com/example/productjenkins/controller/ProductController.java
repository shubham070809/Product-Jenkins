package com.example.productjenkins.controller;

import com.example.productjenkins.model.Product;
import com.example.productjenkins.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //post mapping
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(Product product)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct()
    {
        List<Product> list=new ArrayList<>();
        Iterable<Product> iterable= productRepository.findAll();

        Iterator<Product> iterator= iterable.iterator();
        while (iterator.hasNext())
        {
            list.add(iterator.next());
        }
        return ResponseEntity.ok(list);
    }
}
