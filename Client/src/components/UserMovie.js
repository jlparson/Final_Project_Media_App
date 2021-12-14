import React from "react"
import "./css/MovieList.css";


const UserMovie = ({movie, onMovieClick, watched}) => {

    const handleClick = () =>{
        onMovieClick(movie);
       
     }

    if(!movie){
        return <p>Can't find movie...</p>
    }

    
    return(
        <>
            
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
            <p>Watched: {watched.toString()}</p>
        </>
    )
}

export default UserMovie;