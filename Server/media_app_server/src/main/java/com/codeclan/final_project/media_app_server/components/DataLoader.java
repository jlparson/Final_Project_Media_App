package com.codeclan.final_project.media_app_server.components;

import com.codeclan.final_project.media_app_server.models.Movie;
import com.codeclan.final_project.media_app_server.models.MovieList;
import com.codeclan.final_project.media_app_server.models.SavedMovie;
import com.codeclan.final_project.media_app_server.repositories.MovieListRepository;
import com.codeclan.final_project.media_app_server.repositories.MovieRepository;
import com.codeclan.final_project.media_app_server.repositories.SavedMovieRepository;
import org.hibernate.resource.beans.internal.FallbackBeanInstanceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieListRepository movieListRepository;

    @Autowired
    SavedMovieRepository savedMovieRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Movie redNotice = new Movie("Red Notice", "Action", 1.30, "October 10th, 2021",
                "This is a fun action film, blah blah blah", "Netflix, Amazon", "moreinfolink",
                "posterlink");
        movieRepository.save(redNotice);

        Movie freeGuy = new Movie("Free Guy", "Comedy", 1.30, "October 10th, 2021",
                "A bank teller called Guy realizes he is a background character in an open world video game called Free City that will soon go offline.", "Netflix, Amazon", "moreinfolink", "/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg");
        movieRepository.save(freeGuy);

        Movie shangChi = new Movie("Shang-Chi and the Legend of the Ten Rings", "Fantasy", 1.30, "October 10th, 2021",
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "Netflix, Amazon", "moreinfolink", "/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg");
        movieRepository.save(shangChi);

        Movie armyOfThieves = new Movie("Army of Thieves", "Action", 1.30, "2021-10-27",
                "A mysterious woman recruits bank teller Ludwig Dieter to lead a group of aspiring thieves on a top-secret heist during the early stages of the zombie apocalypse.",
                "Netflix, Amazon", "moreinfolink", "/iPTZGFmPs7HsXHYxiuxGolihjOH.jpg");
        movieRepository.save(armyOfThieves);


        MovieList favouriteMovies = new MovieList("Favourite Movies");
        movieListRepository.save(favouriteMovies);

        MovieList upcomingMovies = new MovieList("Upcoming Movies");
        movieListRepository.save(upcomingMovies);


        SavedMovie savedMovie1 = new SavedMovie(redNotice, favouriteMovies, true);
        savedMovieRepository.save(savedMovie1);

        SavedMovie savedMovie2 = new SavedMovie(freeGuy, favouriteMovies, true);
        savedMovieRepository.save(savedMovie2);

        SavedMovie savedMovie3 = new SavedMovie(shangChi, upcomingMovies, false);
        savedMovieRepository.save(savedMovie3);

        SavedMovie savedMovie4 = new SavedMovie(armyOfThieves, upcomingMovies, false);
        savedMovieRepository.save(savedMovie4);


    }


}
