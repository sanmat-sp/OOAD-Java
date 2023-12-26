package com.example.bookmovie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmovie.models.SeatMatrix1;
import com.example.bookmovie.models.SeatMatrix2;
import com.example.bookmovie.models.SeatMatrix3;
import com.example.bookmovie.models.Show;
import com.example.bookmovie.repositories.SeatMatrix1Repository;
import com.example.bookmovie.repositories.SeatMatrix2Repository;
import com.example.bookmovie.repositories.SeatMatrix3Repository;
import com.example.bookmovie.repositories.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    SeatMatrix1Repository seatMatrix1Repository;

    @Autowired
    SeatMatrix2Repository seatMatrix2Repository;

    @Autowired
    SeatMatrix3Repository seatMatrix3Repository;

    public ShowServiceImpl(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    @Override
    public List<Show> getShows() {
        return showRepository.findAll();
    }

    @Override
    public Show addShow(Show show, Integer id) {
        System.out.println(id);
        if (id == 1) {
            for(int i=1;i<27;i++){
            seatMatrix1Repository.save(
                    new SeatMatrix1(i,0));}
        } else if (id == 2) {
            for(int i=1;i<27;i++){
            seatMatrix2Repository.save(
                    new SeatMatrix2(i,0));}
        } else if (id == 3) {
            for(int i=1;i<27;i++){
            seatMatrix3Repository.save(
                    new SeatMatrix3(i,0));}
        } else {
            return null;
        }
        return showRepository.save(show);
    }

    @Override
    public Show getShowById(Integer showId) {
        Optional<Show> result = showRepository.findById(showId);
        return result.get();
    }

    @Override
    public List<Show> getShowByTheatreId(Integer theatreId) {
        List<Show> result = showRepository.findByTheatreId(theatreId);
        return result;
    }

    @Override
    public List<Show> getShowByMovieId(Integer movieId) {
        List<Show> result = showRepository.findByMovieId(movieId);
        return result;
    }

    @Override
    public boolean deleteShow(Integer showId) {
        showRepository.deleteById(showId);

        if (showRepository.findById(showId) != null) {
            return true;
        }

        return false;
    }

}
