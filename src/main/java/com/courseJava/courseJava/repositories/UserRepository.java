package com.courseJava.courseJava.repositories;

import com.courseJava.courseJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
