package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmovie.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
    
}
