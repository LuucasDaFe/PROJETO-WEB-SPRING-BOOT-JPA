package com.courseJava.courseJava.repositories;

import com.courseJava.courseJava.entities.OrderItem;
import com.courseJava.courseJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
