package com.codeclan.final_project.media_app_server.controllers;

import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.models.SavedMovie;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import com.codeclan.final_project.media_app_server.repositories.SavedMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SavedMovieController {

    @Autowired
    SavedMovieRepository savedMovieRepository;

    @GetMapping(value = "/savedMovies")
    public ResponseEntity<List<SavedMovie>> getAllSavedMovies(){
        return new ResponseEntity<>(savedMovieRepository.findAll(), HttpStatus.OK);
    }
}
