package com.example.bookmovie.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @Column(name = "showId")
    private Integer showId;
    @Column(name = "date")
    private Date date;
    @Column(name = "colNo")
    private String colNo;
    @Column(name = "price")
    private Double price;
    @Column(name = "movieId")
    private Integer movieId;
    @Column(name = "Email")
    private String emailId;

    public Booking() {
    }

    public Booking(Integer bookingId, Integer showId, Date date, String colNo, Integer movieId, Double price,
            String emailId) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.date = date;
        this.colNo = colNo;
        this.movieId = movieId;
        this.price = price;
        this.emailId = emailId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getShowId() {
        return showId;
    }

    public Date getDate() {
        return date;
    }

    public String getColNo() {
        return colNo;
    }

    public Double getPrice() {
        return price;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setColNo(String colNo) {
        this.colNo = colNo;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", showId=" + showId + ", date=" + date + ", colNo=" + colNo
                + ", movieId=" + movieId + ", price=" + price + ", emailId=" + emailId + "]";
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

}
