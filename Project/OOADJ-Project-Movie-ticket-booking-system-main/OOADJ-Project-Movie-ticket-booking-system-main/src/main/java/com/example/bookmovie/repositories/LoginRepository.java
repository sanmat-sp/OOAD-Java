package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
    @Query("SELECT L FROM Login L WHERE L.email = ?1")
    Login findByEmailId(String email);

    @Query("SELECT L FROM Login L WHERE L.loginId in (select min(L.loginId) from Login L) ")
    Login getCurrentUserEmail();
}
