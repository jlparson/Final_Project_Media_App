package com.codeclan.final_project.media_app_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class MovieList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "listName")
    private String listName;

    @JsonIgnoreProperties(value="movieList")
    @OneToMany(mappedBy = "movieList", fetch = FetchType.LAZY)
    private List<SavedMovie> savedMovies;

    public MovieList(String listName) {
        this.listName = listName;
        this.savedMovies = new ArrayList<SavedMovie>();
    }

    public MovieList(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public List<SavedMovie> getSavedMovies() {
        return savedMovies;
    }

    public void setSavedMovies(List<SavedMovie> savedMovies) {
        this.savedMovies = savedMovies;
    }
}
