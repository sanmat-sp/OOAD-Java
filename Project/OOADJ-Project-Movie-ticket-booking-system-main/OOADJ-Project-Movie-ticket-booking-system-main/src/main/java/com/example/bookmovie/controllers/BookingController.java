package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.bookmovie.models.Booking;
import com.example.bookmovie.service.BookingService;

@RestController
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public List<Booking> getAll(){
        return bookingService.getBookings();
    }

    @PostMapping("/bookings")
    public Booking addBooking(@RequestBody Booking booking){
        
        return bookingService.addBooking(booking);
    }

    @GetMapping("/bookings/{bookingId}")
    public Booking getById(@PathVariable Integer bookingId){
        return bookingService.getBookingById(bookingId);
    }

    @DeleteMapping("/deleteBookings/{bookingId}")
    public String deleteBooking(@PathVariable Integer bookingId, RedirectAttributes redirectAttributes) {
        if (bookingService.deleteBooking(bookingId)) {
            redirectAttributes.addFlashAttribute("message", "Delete Success");
        } else {
            redirectAttributes.addFlashAttribute("message", "Delete Failure");
        }

        return "redirect:/bookings";
    }
}
