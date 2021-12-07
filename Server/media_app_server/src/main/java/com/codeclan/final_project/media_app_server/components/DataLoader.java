package com.codeclan.final_project.media_app_server.components;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieRepository movieRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Movie redNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021", "This is a fun action film, blah blah blah", "Netflix, Amazon", "moreinfolink", "posterlink");
        movieRepository.save(redNotice);

        Movie blueNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021", "This is a fun action film, blah blah blah", "Netflix, Amazon", "moreinfolink", "posterlink2");
        movieRepository.save(blueNotice);

        Movie greenNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021", "This is a fun action film, blah blah blah", "Netflix, Amazon", "moreinfolink", "posterlink3");
        movieRepository.save(greenNotice);

        Movie blackNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021", "This is a fun action film, blah blah blah", "Netflix, Amazon", "moreinfolink", "posterlink4");
        movieRepository.save(blackNotice);
    }

}
