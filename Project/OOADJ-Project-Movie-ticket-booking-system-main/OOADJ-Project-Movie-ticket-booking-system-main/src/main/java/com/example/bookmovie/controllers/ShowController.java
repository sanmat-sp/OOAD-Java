package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.Show;
import com.example.bookmovie.service.ShowService;

@RestController
public class ShowController {
    private ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping("/shows")
    public List<Show> getAll() {
        return showService.getShows();
    }

    // @PostMapping("/shows")
    // public Show addShow(@RequestBody Show show) {
    //     return showService.addShow(show);
    // }

    @GetMapping("/shows/{showId}")
    public Show getById(@PathVariable Integer showId) {
        return showService.getShowById(showId);
    }

    @GetMapping("/shows/movie/{movieId}")
    public List<Show> getByMovieId(@PathVariable Integer movieId) {
        return showService.getShowByMovieId(movieId);
    }

    @GetMapping("/shows/theatre/{theatreId}")
    public List<Show> getByTheatreId(@PathVariable Integer theatreId) {
        return showService.getShowByTheatreId(theatreId);
    }

    @DeleteMapping("/deleteShows/{showId}")
    public String deleteBooking(@PathVariable Integer showId, RedirectAttributes redirectAttributes) {
        if (showService.deleteShow(showId)) {
            redirectAttributes.addFlashAttribute("message", "Delete Success");
        } else {
            redirectAttributes.addFlashAttribute("message", "Delete Failure");
        }

        return "redirect:/shows";
    }
}
