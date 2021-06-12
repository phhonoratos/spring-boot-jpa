package com.springbootjpa.services;

import java.util.List;
import java.util.Optional;

import com.springbootjpa.entities.Product;
import com.springbootjpa.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }
    
    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
    
}
