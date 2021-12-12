import React, { useState, useEffect } from "react";
// import{ Route, Switch } from "react-router-dom";
import CuratedList from "../components/CuratedList";
import Request from '../helpers/request';
import MovieDetail from "../components/MovieDetails";
import "./MovieContainer.css"


const MovieContainer = () => {

    const [list1, setList1] = useState(null);
    const [list2, setList2] = useState(null);
    const [list3, setList3] = useState(null);
    const [selectedMovie, setSelectedMovie] = useState(null);
    
    
    

const requestAll = function() {
    const request = new Request();
    const list1Promise = request.get('/api/movieLists/1')
    const list2Promise = request.get('/api/movieLists/2')
    const list3Promise = request.get('/api/movieLists/3')
            

Promise.all([list1Promise, list2Promise, list3Promise ])
    .then((data) => {
    setList1(data[0]);
    setList2(data[1]);
    setList3(data[2]);
    })
}

useEffect(() => {
    requestAll()
}, [])

const onMovieClick = (movie) => {
    setSelectedMovie(movie);
    }



    

    return(
        <>
        
        {list1 && list2 && list3? <CuratedList onMovieClick={onMovieClick} list1={list1} list2={list2} list3={list3}/>: null}
        {selectedMovie ? <MovieDetail selectedMovie={selectedMovie} /> : null}
        
        </>

    )
}

export default MovieContainer;