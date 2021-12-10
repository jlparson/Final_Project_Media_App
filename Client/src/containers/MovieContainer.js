import React, { useState, useEffect } from "react";
// import{ Route, Switch } from "react-router-dom";
import MovieList from "../components/MovieList";
import Request from '../helpers/request';


const MovieContainer = () => {

    const [movies, setMovies] = useState([]);

    const requestAll = function() {
        const request = new Request();
        const moviePromise = request.get('/api/movies')
    

    Promise.all([moviePromise])
    .then((data) => {
        setMovies(data[0]);
        })
    }

    useEffect(() => {
        requestAll()
    }, [])

    

    return(
        <>
        <p>Movie Poster</p>
        <MovieList movies={movies}/>
        </>

    )
}

export default MovieContainer;