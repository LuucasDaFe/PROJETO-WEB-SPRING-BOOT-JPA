package com.courseJava.courseJava.repositories;

import com.courseJava.courseJava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
