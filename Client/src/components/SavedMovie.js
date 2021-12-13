import React from "react"
import "./css/MovieList.css";


const savedMovie = ({savedMovie, onSavedMovieClick}) => {

    const handleClick = () =>{
        onSavedMovieClick(savedMovie);
       
     }

    if(!savedMovie){
        return <p>Can't find movie...</p>
    }

    
    return(
        <>
            
            <img onClick={handleClick} id = "poster" src={savedMovie.poster}  alt="movie poster" />
        </>
    )
}

export default savedMovie;