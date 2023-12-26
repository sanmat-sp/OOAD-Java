package com.example.bookmovie.service;

import java.util.List;

import com.example.bookmovie.models.Theatre;

public interface TheatreService {
    public List<Theatre> getTheatres();
    public Theatre addTheatre(Theatre theatre);
    public Theatre getTheatreById(Integer theatreId);
    public boolean deleteTheatre(Integer theatreId);
}
