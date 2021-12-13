package com.codeclan.final_project.media_app_server.controllers;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.models.SavedMovie;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import com.codeclan.final_project.media_app_server.repositories.SavedMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SavedMovieController {

    @Autowired
    SavedMovieRepository savedMovieRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieListRepository movieListRepository;

    @GetMapping(value = "/savedMovies")
    public ResponseEntity<List<SavedMovie>> getAllSavedMovies(){
        return new ResponseEntity<>(savedMovieRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/savedMovies/{id}")
    public ResponseEntity getSavedMovie(@PathVariable Long id){
        return new ResponseEntity(savedMovieRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/savedMovies")
    public ResponseEntity<SavedMovie> postSavedMovie(@RequestBody SavedMovie savedMovie){
        savedMovieRepository.save(savedMovie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);

    }

    @GetMapping(value = "/savedMovies/{movieid}/movielist/{listid}")
    public ResponseEntity<SavedMovie> postSavedMovie(@PathVariable Long movieid, @PathVariable Long listid) {
        Movie foundMovie = movieRepository.getById(movieid);
        MovieList foundList = movieListRepository.getById(listid);
        SavedMovie savedMovie = new SavedMovie(foundMovie, foundList, false );
        savedMovieRepository.save(savedMovie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);

    }

    @PatchMapping(value = "/savedMovies/{id}")
    public ResponseEntity<SavedMovie> updateSavedMovie(@RequestBody SavedMovie savedMovie){
        savedMovieRepository.save(savedMovie);
        return new ResponseEntity<>(savedMovie, HttpStatus.OK);
    }

    @DeleteMapping(value = "/savedMovies/{id}")
    public ResponseEntity<SavedMovie> deleteSavedMovie(@PathVariable Long id){
        SavedMovie found = savedMovieRepository.getById(id);
        savedMovieRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
