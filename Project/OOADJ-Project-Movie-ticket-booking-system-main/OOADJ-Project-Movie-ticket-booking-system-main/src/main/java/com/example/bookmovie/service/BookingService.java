package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Booking;

public interface BookingService {
    public List<Booking> getBookings();

    public Booking addBooking(Booking Booking);

    public Booking getBookingById(Integer bookingId);

    public boolean deleteBooking(Integer bookingId);

    public List<Booking> getBookingByEmail(String email);
}
