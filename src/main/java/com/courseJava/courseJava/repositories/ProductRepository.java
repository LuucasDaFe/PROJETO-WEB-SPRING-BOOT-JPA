package com.courseJava.courseJava.repositories;

import com.courseJava.courseJava.entities.Category;
import com.courseJava.courseJava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
