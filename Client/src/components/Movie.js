import React from "react"
import "./css/MovieList.css";


const Movie = ({movie, onMovieClick}) => {


    const handleClick = () =>{
        onMovieClick(movie);
       console.log({movie})
     }

    if(!movie){
        return <p>Can't find movie...</p>
    }
   

    return(
        <>
            
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
        </>
    )
}

export default Movie;