package com.courseJava.courseJava.services;

import com.courseJava.courseJava.entities.Product;
import com.courseJava.courseJava.entities.User;
import com.courseJava.courseJava.repositories.ProductRepository;
import com.courseJava.courseJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}