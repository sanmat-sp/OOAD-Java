package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT U FROM User U WHERE U.email = ?1")
    User findByEmailId(String email);

}
