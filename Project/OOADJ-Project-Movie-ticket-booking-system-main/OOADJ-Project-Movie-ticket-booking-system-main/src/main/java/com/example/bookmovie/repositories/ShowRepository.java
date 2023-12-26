package com.example.bookmovie.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {

    @Query("SELECT S FROM Show S WHERE S.movieId = ?1")
    List<Show> findByMovieId(Integer id);

    @Query("SELECT S FROM Show S WHERE S.theatreId = ?1")
    List<Show> findByTheatreId(Integer theatreId);
}
