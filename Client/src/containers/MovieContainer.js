import React, { useState, useEffect } from "react";
import{ Route, Routes } from "react-router-dom";
import CuratedList from "../components/CuratedList";
import UserCuratedList from "../components/UserCuratedList";
import Request from '../helpers/request';
import MovieDetail from "../components/MovieDetails";
import UserMovieDetail from "../components/UserMovieDetails";

import "./MovieContainer.css"
const MovieContainer = () => {
    const [list1, setList1] = useState(null);
    const [list2, setList2] = useState(null);
    const [list3, setList3] = useState(null);
    const [list4, setList4] = useState(null);
    const [list5, setList5] = useState(null);
    const [list6, setList6] = useState(null);
    const [selectedMovie, setSelectedMovie] = useState(null);
    const [selectedSavedMovie, setSelectedSavedMovie] = useState(null);
    const [viewUserLists, setViewUserLists] = useState(true);
    const [savedMovies, setSavedMovies] = useState(null);
    
    
    
const requestAll = function() {
    const request = new Request();
    const list1Promise = request.get('/api/movieLists/1')
    const list2Promise = request.get('/api/movieLists/2')
    const list3Promise = request.get('/api/movieLists/3')
    const list4Promise = request.get('/api/movieLists/user/4')
    const list5Promise = request.get('/api/movieLists/user/5')
    const list6Promise = request.get('/api/movieLists/user/6')
    const savedMoviesPromise = request.get('/api/savedMovies')
            
Promise.all([list1Promise, list2Promise, list3Promise, list4Promise, list5Promise, list6Promise, savedMoviesPromise ])
    .then((data) => {
    setList1(data[0]);
    setList2(data[1]);
    setList3(data[2]);
    setList4(data[3]);
    setList5(data[4]);
    setList6(data[5]);
    setSavedMovies(data[6]);
    }, [savedMovies])
}

useEffect(() => {
    requestAll()
}, [])

const onMovieClick = (movie) => {
    setSelectedMovie(movie);
}

const onButtonClick=() =>{
    setSelectedMovie(null)
}



const onWatchedButtonClick = (selectedMovieId) => {
    console.log(selectedMovie);
    for (let savedMovie of savedMovies){
        if(savedMovie.movie.id === selectedMovieId){
            savedMovie.watched = !savedMovie.watched;
            console.log(savedMovie);
            const request = new Request();
            request.patch('/api/savedMovies/{id}', savedMovie)
            .then(setViewUserLists(true))
            .then(window.location.href = "http://localhost:3000/");
            
        }
    }
}



const handleAddToListSubmit = (selectedMovie, selectedList) => {
    
    const movieid = selectedMovie.id;
    const listid = selectedList;
    console.log(movieid, listid);
    const request = new Request();
    request.get("/api/savedMovies/"+movieid+"/movielist/"+listid )
    }

const handleUserViewChange = () => {
    console.log("test2");
    setViewUserLists(!viewUserLists);
}

if(viewUserLists){
    return(
        <>
        {viewUserLists? <UserCuratedList onMovieClick={onMovieClick} handleViewChange={handleUserViewChange} savedMovies={savedMovies} viewUserLists={viewUserLists}/>: null}
        {selectedMovie ? <UserMovieDetail onButtonClick= {onButtonClick} selectedMovie={selectedMovie} handleAddToListSubmit={handleAddToListSubmit} onWatchedButtonClick={onWatchedButtonClick} list1={list1} list2={list2} list3={list3}/> : null}
        </> 
    )
} else {
    return(
        <>
        {list1 && list2 && list3? <CuratedList onMovieClick={onMovieClick} savedMovies={savedMovies} handleViewChange={handleUserViewChange} list1={list1} list2={list2} list3={list3} viewUserLists={viewUserLists}/>: null}
        {selectedMovie ? <MovieDetail onButtonClick= {onButtonClick} selectedMovie={selectedMovie} handleAddToListSubmit={handleAddToListSubmit} onWatchedButtonClick={onWatchedButtonClick} list1={list1} list2={list2} list3={list3}/> : null}
        </> 
    )
}
}

export default MovieContainer;