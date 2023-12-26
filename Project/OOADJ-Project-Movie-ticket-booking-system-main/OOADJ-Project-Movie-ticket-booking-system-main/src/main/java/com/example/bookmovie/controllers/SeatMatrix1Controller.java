package com.example.bookmovie.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

// import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.repositories.SeatMatrix1Repository;
import com.example.bookmovie.service.SeatMatrix1Service;

@RestController
public class SeatMatrix1Controller {
    private SeatMatrix1Service seatMatrix1Service;

    public SeatMatrix1Controller(SeatMatrix1Service seatMatrix1Service) {
        this.seatMatrix1Service = seatMatrix1Service;
    }

    private com.example.bookmovie.models.SeatMatrix1 seatMatrix1;

    public void SeatMatrix1(SeatMatrix1 seatMatrix1) {
        this.seatMatrix1 = seatMatrix1;
    }

    private SeatMatrix1Repository seatMatrix1Repository;

    public void SeatMatrix1Repository(SeatMatrix1Repository seatMatrix1Repository) {
        this.seatMatrix1Repository = seatMatrix1Repository;
    }

    @GetMapping("/seatMatrix1s")
    public List<SeatMatrix1> getAll() {
        return seatMatrix1Service.getSeatMatrix1s();
    }

    // @PostMapping(value = "/selectSeat")
    // public String makeSeatReserved(@RequestParam Integer colName, Integer showId)
    // {
    // if (showId == 1) {
    // seatMatrix1Service.selectSeat(colName);
    // return "Selected seatMatrix1";
    // } else if (showId == 2) {
    // // seatMatrix2Service.selectSeat(colName);
    // return "Selected seatMatrix2";
    // } else if (showId == 3) {
    // // seatMatrix3Service.selectSeat(colName);
    // return "Selected seatMatrix3";
    // }
    // return "Invalid show id";
    // }

}
