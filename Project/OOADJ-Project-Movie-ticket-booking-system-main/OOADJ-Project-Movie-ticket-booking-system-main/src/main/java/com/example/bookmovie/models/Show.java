package com.example.bookmovie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ShowS")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer showId;
    @Column(name = "theatreId")
    Integer theatreId;
    @Column(name = "movieId")
    Integer movieId;
    @Column(name = "date")
    String date;
    @Column(name = "startTime")
    String startTime;
    @Column(name = "endTime")
    String endTime;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatMatrixId")
    Integer seatMatrixID;

    public Show() {
    }

    public Show(Integer showId, Integer theatreId, Integer movieId, String date, String startTime, String endTime,
            Integer seatMatrixID) {
        this.showId = showId;
        this.theatreId = theatreId;
        this.movieId = movieId;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seatMatrixID = seatMatrixID;
    }

    public Integer getShowId() {
        return showId;
    }

    public Integer getTheatreId() {
        return theatreId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getSeatMatrixID() {
        return seatMatrixID;
    }

    public void setSeatMatrixID(Integer seatMatrixID) {
        this.seatMatrixID = seatMatrixID;
    }

    @Override
    public String toString() {
        return "Show [showId=" + showId + ", theatreId=" + theatreId + ", movieId=" + movieId + ", date=" + date
                + ", startTime="
                + startTime + ", endTime=" + endTime + ", seatMatrixID=" + seatMatrixID + "]";
    }

}
