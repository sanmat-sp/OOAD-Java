package com.example.bookmovie.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // @Query("SELECT B FROM Booking B WHERE B.email = ?1")
    List<Booking> findByEmailId(String email);
}
