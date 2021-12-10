package com.codeclan.final_project.media_app_server.controllers;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieListController {

    @Autowired
    MovieListRepository movieListRepository;

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/movieLists")
    public ResponseEntity<List<MovieList>> getMovieList(){
        return new ResponseEntity<>(movieListRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/movieLists/{id}")
    public ResponseEntity getMovieList(@PathVariable Long id){
        return new ResponseEntity(movieRepository.findMoviesForMovieList(id), HttpStatus.OK);
    }

    @PostMapping(value = "/movieLists")
    public ResponseEntity<MovieList> postMovieList(@RequestBody MovieList movieList){
        movieListRepository.save(movieList);
        return new ResponseEntity<>(movieList, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/movieLists/{id}")
    public ResponseEntity<MovieList> updateMovieList(@RequestBody MovieList movieList){
        movieListRepository.save(movieList);
        return new ResponseEntity<>(movieList, HttpStatus.OK);
    }

    @DeleteMapping(value = "/movieLists/{id}")
    public ResponseEntity<MovieList> deleteMovieList(@PathVariable Long id){
        MovieList found = movieListRepository.getById(id);
        movieListRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
