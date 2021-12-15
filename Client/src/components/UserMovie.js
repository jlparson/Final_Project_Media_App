import React from "react";
import StarRating from "../components/StarRating";
import "./css/MovieList.css";


const UserMovie = ({movie, onMovieClick, watched, rating}) => {



    const handleClick = () =>{
        onMovieClick(movie);
       
     }



    if(!movie){
        return <p>Can't find movie...</p>
    }

    if(watched == false){
        return(
            <>
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
            <p><b><center>Watched: &#10060;</center></b></p>
            <StarRating />
            </>
        )
    } else {
        return(
            <>
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
            <p><b><center>Watched: &#x2705;</center></b></p>
            <StarRating />
            </>
        )
    }

}

export default UserMovie;