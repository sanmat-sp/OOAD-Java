package com.example.bookmovie.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.bookmovie.models.Movie;
import com.example.bookmovie.repositories.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieRepository.findAll().forEach(movie -> movieList.add(movie));
        // System.out.println(movieList);
        return movieList;
    }

    @Override
    public Movie getMovieById(Integer id) {
        Optional<Movie> result = movieRepository.findById(id);
        return result.get();
    }

    // @Override
    // public void addMovie(String name, String genre, Integer durationMins, String releaseDate, String description,
    //         MultipartFile file) {
    //     Movie movie = new Movie();
    //     movie.setName(name);
    //     movie.setGenre(genre);
    //     movie.setReleaseDate(releaseDate);
    //     movie.setDurationMins(durationMins);
    //     movie.setDescription(description);

    //     String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    //     if (fileName.contains("..")) {
    //         System.out.println("not a a valid file");
    //     }
    //     try {
    //         movie.setImageData(Base64.getEncoder().encodeToString(file.getBytes()));
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }

    //     movieRepository.save(movie);
    // }
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public boolean deleteMovie(Integer id) {
        movieRepository.deleteById(id);

        if (movieRepository.findById(id) != null) {
            return true;
        }

        return false;
    }
}
