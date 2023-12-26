package com.example.bookmovie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Theatre")
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "theatreId")
    private Integer theatreId;
    @Column(name = "name")
    private String name;
    @Column(name = "totalSeats")
    private Integer totalSeats;
    @Column(name = "address")
    private String address;

    public Theatre() {
    }

    public Theatre(Integer theatreId, String name, Integer totalSeats, String address) {
        this.theatreId = theatreId;
        this.name = name;
        this.totalSeats = totalSeats;
        this.address = address;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public String getName() {
        return name;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public String getAddress() {
        return address;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
