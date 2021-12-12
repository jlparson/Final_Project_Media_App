import React, {useState} from "react";
import Movie from "./Movie";
import "./css/MovieList.css";
import MovieDetail from "./MovieDetails";

const MovieList = ({list1, list2, onMovieClick}) => {

    

    

    const movieList1 = list1.map((movie, index) => {

    
        return (
            
            <li   key={index} className="list-item">
            <div className="list-item">
            <Movie movie={movie} onMovieClick={onMovieClick}/>
            </div>
            </li>
        )
    })

    const movieList2 = list2.map((movie, index) => {
        return (
            
            <li key={index} className="list-item">
            <div className="list-item">
            <Movie movie={movie} onMovieClick={onMovieClick}/>
            </div>
            </li>
        )
    })

    return (
        <>
        <ul>{movieList1}</ul>
        <ul>{movieList2}</ul>
        
        </>
    )

    }


export default MovieList;