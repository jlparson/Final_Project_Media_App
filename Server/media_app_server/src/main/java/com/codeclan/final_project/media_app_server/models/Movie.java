package com.codeclan.final_project.media_app_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties(value="movie")
    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<SavedMovie> savedMovies;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "runTime")
    private double runTime;

    @Column(name = "releaseDate")
    private String releaseDate;

    @Column(name = "description", length=1000)
    private String description;

    @Column(name = "providers")
    private String providers;

    @Column(name = "moreInfo")
    private String moreInfo;

    @Column(name = "poster")
    private String poster;


    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Movie(String title, String genre, double runTime, String releaseDate, String description, String providers, String moreInfo, String poster) {
        this.title = title;
        this.genre = genre;
        this.runTime = runTime;
        this.releaseDate = releaseDate;
        this.description = description;
        this.providers = providers;
        this.moreInfo = moreInfo;
        this.poster = poster;
    }

    public Movie(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProviders() {
        return providers;
    }

    public void setProviders(String providers) {
        this.providers = providers;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}
