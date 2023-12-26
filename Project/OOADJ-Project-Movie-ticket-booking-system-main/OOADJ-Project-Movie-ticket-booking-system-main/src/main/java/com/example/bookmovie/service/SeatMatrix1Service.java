package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.SeatMatrix1;

public interface SeatMatrix1Service {
    public List<SeatMatrix1> getSeatMatrix1s();
    public Object selectSeat(Integer colName);
    public Object deselectSeat(Integer colName);
}
