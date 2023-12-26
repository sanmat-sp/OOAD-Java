package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.SeatMatrix2;

public interface SeatMatrix2Service {
    public List<SeatMatrix2> getSeatMatrix2s();
    public Object selectSeat(Integer colName);
    public Object deselectSeat(Integer colName);
}
