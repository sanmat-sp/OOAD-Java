package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Theatre;
import com.example.bookmovie.repositories.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {


    private TheatreRepository theatreRepository;

    public TheatreServiceImpl(TheatreRepository theatreRepository){
        this.theatreRepository = theatreRepository;
    }


    @Override
    public List<Theatre> getTheatres() {
        return theatreRepository.findAll();
    }

    @Override
    public Theatre addTheatre(Theatre theatre) {
            return theatreRepository.save(theatre);
    }

    @Override
    public Theatre getTheatreById(Integer theatreId) {
        Optional<Theatre> result = theatreRepository.findById(theatreId);
        return result.get();
    }
    
    @Override
    public boolean deleteTheatre(Integer theatreId) {
        theatreRepository.deleteById(theatreId);

        if (theatreRepository.findById(theatreId) != null) {
            return true;
        }

        return false;
    }
}
