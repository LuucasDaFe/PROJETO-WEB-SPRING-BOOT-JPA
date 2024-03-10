package com.courseJava.courseJava.services;

import com.courseJava.courseJava.entities.Category;
import com.courseJava.courseJava.entities.Order;
import com.courseJava.courseJava.repositories.CategoryRepository;
import com.courseJava.courseJava.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}