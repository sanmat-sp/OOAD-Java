package com.example.bookmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.bookmovie.models.SeatMatrix3;

public interface SeatMatrix3Repository extends JpaRepository<SeatMatrix3, Integer>{
    @Modifying
    @Query("UPDATE SeatMatrix3 S SET S.value=1 WHERE S.colName=?1")
    Object resetColumnToOne(Integer colName);
    
    @Modifying
    @Query("UPDATE SeatMatrix3 S SET S.value=0 WHERE S.colName=?1")
    Object resetColumnToZero(Integer colName);
}
