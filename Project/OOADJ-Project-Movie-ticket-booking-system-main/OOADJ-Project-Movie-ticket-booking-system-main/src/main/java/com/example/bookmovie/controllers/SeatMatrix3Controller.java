package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.SeatMatrix3;
import com.example.bookmovie.service.SeatMatrix3Service;

@RestController
public class SeatMatrix3Controller {
    private SeatMatrix3Service seatMatrix3Service;

    public SeatMatrix3Controller(SeatMatrix3Service seatMatrix3Service){
        this.seatMatrix3Service = seatMatrix3Service;
    }

    @GetMapping("/seatMatrix3s")
    public List<SeatMatrix3> getAll(){
        return seatMatrix3Service.getSeatMatrix3s();
    }
}
