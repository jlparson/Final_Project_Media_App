import React from "react";
import Movie from "./Movie";
import "./css/MovieList.css";
import MovieDetail from "./MovieDetails";
const UserCuratedList = ({onMovieClick, onButtonClick, handleViewChange, viewUserLists, savedMovies}) => {
    const recentlyAdded = [];
    const familyFriendly = [];
    const recommended = []
    let curatedList1 = []
    let curatedList2 = []
    let curatedList3 = []
    if(savedMovies){
        savedMovies.map((movie) => {
            if(movie.movieList.listName == "Favourite movies"){
                familyFriendly.push(movie);
            }
            if(movie.movieList.listName == "Movies to watch later"){
                recommended.push(movie);
            }
            if(movie.movieList.listName == "Movies to watch with the kids"){
                recentlyAdded.push(movie);
            }
        })
        curatedList1 = recentlyAdded.map((movie, index) => {
            return (
                
                <li   key={index} className="list-item">
                <div className="list-item">
                <Movie movie={movie.movie} onMovieClick={onMovieClick}/>
                </div>
                </li>
            )
        })
        curatedList2 = familyFriendly.map((movie, index) => {
            return (
                
                <li   key={index} className="list-item">
                <div className="list-item">
                <Movie movie={movie.movie} onMovieClick={onMovieClick}/>
                </div>
                </li>
            )
        })
        curatedList3 = recommended.map((movie, index) => {
            return (
                
                <li   key={index} className="list-item">
                <div className="list-item">
                <Movie movie={movie.movie} onMovieClick={onMovieClick}/>
                </div>
                </li>
            )
        })
    }
    const setUserView = () => {
        console.log("test");
        handleViewChange();
    }
        if(recentlyAdded.length >= 0){
            return(
                <>
                <br></br><br></br><br></br>
                <button onClick={setUserView}>User view</button>
                <h3>To Watch with Kids</h3>
                <ul>{curatedList1}</ul>
                <h3>Favourite Movies</h3>
                <ul>{curatedList2}</ul>
                <h3>Watch later</h3>
                <ul>{curatedList3}</ul>
                </> 
            )
        } else {
            return(
                <>
                <p>Loading....</p>
                </> 
            )
        }
    }
export default UserCuratedList;