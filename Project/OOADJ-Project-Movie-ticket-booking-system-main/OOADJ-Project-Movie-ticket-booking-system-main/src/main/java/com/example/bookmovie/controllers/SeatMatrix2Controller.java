package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.SeatMatrix2;
import com.example.bookmovie.service.SeatMatrix2Service;

@RestController
public class SeatMatrix2Controller {
    private SeatMatrix2Service seatMatrix2Service;

    public SeatMatrix2Controller(SeatMatrix2Service seatMatrix2Service){
        this.seatMatrix2Service = seatMatrix2Service;
    }

    @GetMapping("/seatMatrix2s")
    public List<SeatMatrix2> getAll(){
        return seatMatrix2Service.getSeatMatrix2s();
    }
}
