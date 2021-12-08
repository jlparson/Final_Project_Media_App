package com.codeclan.final_project.media_app_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table
public class SavedMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value = "savedMovies")
    @ManyToOne
    @JoinColumn(name = "saved_movie_id", nullable = false)
    private Movie movie;

    @JsonIgnoreProperties(value = "savedMovies")
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "saved_movie_list_id", nullable = false)
    private MovieList movieList;

    @Column(name = "watched")
    private boolean watched;

    public SavedMovie(Movie movie, MovieList movieList, boolean watched) {
        this.movie = movie;
        this.movieList = movieList;
        this.watched = watched;
    }

    public SavedMovie(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieList getMovieList() {
        return movieList;
    }

    public void setMovieList(MovieList movieList) {
        this.movieList = movieList;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
