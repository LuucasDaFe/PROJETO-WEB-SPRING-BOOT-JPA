package com.courseJava.courseJava.repositories;

import com.courseJava.courseJava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
