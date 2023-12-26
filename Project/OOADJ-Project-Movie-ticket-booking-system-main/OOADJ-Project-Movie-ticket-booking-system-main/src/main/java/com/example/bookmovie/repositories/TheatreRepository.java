package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmovie.models.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
    
}
