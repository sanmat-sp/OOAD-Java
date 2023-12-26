package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.SeatMatrix3;

public interface SeatMatrix3Service {
    public List<SeatMatrix3> getSeatMatrix3s();
    public Object selectSeat(Integer colName);
    public Object deselectSeat(Integer colName);
}
