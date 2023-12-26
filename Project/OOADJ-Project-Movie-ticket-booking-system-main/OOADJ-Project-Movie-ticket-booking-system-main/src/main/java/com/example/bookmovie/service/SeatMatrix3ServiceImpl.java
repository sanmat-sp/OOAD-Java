package com.example.bookmovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.SeatMatrix3;
import com.example.bookmovie.repositories.SeatMatrix3Repository;

@Service
public class SeatMatrix3ServiceImpl implements SeatMatrix3Service{

    private SeatMatrix3Repository seatMatrix3Repository;

    public SeatMatrix3ServiceImpl(SeatMatrix3Repository seatMatrix3Repository){
        this.seatMatrix3Repository = seatMatrix3Repository;
    }

    @Override
    public List<SeatMatrix3> getSeatMatrix3s() {
        return seatMatrix3Repository.findAll();
    }
    
    @Override
    @Transactional
    public Object selectSeat(Integer colName) {
        return seatMatrix3Repository.resetColumnToOne(colName);
    }

    @Override
    @Transactional
    public Object deselectSeat(Integer colName) {
        return seatMatrix3Repository.resetColumnToZero(colName);
    }
}
