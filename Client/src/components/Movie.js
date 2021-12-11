import React from "react"
import "./css/MovieList.css";


const Movie = ({movie}) => {

    const handleClick = function() {
        console.log({movie})
      }

    if(!movie){
        return <p>Can't find movie...</p>
    }

    // const url = "/movies/" + movie.id;

    return(
        <>
            
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
        </>
    )
}

export default Movie;