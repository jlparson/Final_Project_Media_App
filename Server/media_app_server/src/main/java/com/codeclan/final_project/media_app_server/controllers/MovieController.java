package com.codeclan.final_project.media_app_server.controllers;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/movies/{id}")
    public ResponseEntity getMovie(@PathVariable Long id){
        return new ResponseEntity(movieRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/movies")
    public ResponseEntity<Movie> postMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @DeleteMapping(value = "/movies/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable Long id){
        Movie found = movieRepository.getById(id);
        movieRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
