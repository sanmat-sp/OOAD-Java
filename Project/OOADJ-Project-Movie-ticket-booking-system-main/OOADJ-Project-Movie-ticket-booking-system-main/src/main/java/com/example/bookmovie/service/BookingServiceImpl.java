package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Booking;
import com.example.bookmovie.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    // private ShowService showService;
    private BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking addBooking(Booking Booking) {

        // // ShowService showService;
        // List<Show> shows = showService.getShows();
        // // Seatmatrix [] sms = shows.
        // // SeatMatrix sm[];
        // // Show[] shows = shows.toArray(new Show[show.size()])
        // for (Show show : shows) {
        // if (show.getShowId() == Booking.getShowId()) {
        // Integer sm = show.getSeatMatrixID();

        // // sm.confirmSeats(Booking.getSeat());
        // // Seat s[] = Booking.getSeatsBooked();
        // // for (Seat s : Booking.getSeatsBooked()) {
        // // sm.confirmSeats(s.getSeatId());
        // // }
        // }
        // }
        return bookingRepository.save(Booking);
    }

    @Override
    public Booking getBookingById(Integer bookingId) {
        Optional<Booking> result = bookingRepository.findById(bookingId);
        return result.get();
    }

    @Override
    public boolean deleteBooking(Integer bookingId) {
        bookingRepository.deleteById(bookingId);

        if (bookingRepository.findById(bookingId) != null) {
            return true;
        }

        return false;
    }

    @Override
    public List<Booking> getBookingByEmail(String email) {
        return bookingRepository.findByEmailId(email);
    }
}
