package com.codeclan.final_project.media_app_server.controllers;

import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieListController {

    @Autowired
    MovieListRepository movieListRepository;

    @GetMapping(value = "/movieLists")
    public ResponseEntity<List<MovieList>> getMovieList(){
        return new ResponseEntity<>(movieListRepository.findAll(), HttpStatus.OK);
    }
}
