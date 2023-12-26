package com.example.bookmovie.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.SeatMatrix2;
import com.example.bookmovie.repositories.SeatMatrix2Repository;

@Service
public class SeatMatrix2ServiceImpl implements SeatMatrix2Service{

    private SeatMatrix2Repository seatMatrix2Repository;

    public SeatMatrix2ServiceImpl(SeatMatrix2Repository seatMatrix2Repository){
        this.seatMatrix2Repository = seatMatrix2Repository;
    }

    @Override
    public List<SeatMatrix2> getSeatMatrix2s() {
        return seatMatrix2Repository.findAll();
    }
    
    @Override
    @Transactional
    public Object selectSeat(Integer colName) {
        return seatMatrix2Repository.resetColumnToOne(colName);
    }

    @Override
    @Transactional
    public Object deselectSeat(Integer colName) {
        return seatMatrix2Repository.resetColumnToZero(colName);
    }
}
