package com.codeclan.final_project.media_app_server.models;

import javax.persistence.*;

@Entity
@Table
public class SavedMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movieId")
    private Long movieId;

    @Column(name = "listId")
    private Long listId;

    @Column(name = "watched")
    private boolean watched;

    public SavedMovie(Long movieId, Long listId, boolean watched) {
        this.movieId = movieId;
        this.listId = listId;
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

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
