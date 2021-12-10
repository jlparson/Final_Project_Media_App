import React from "react"


const Movie = ({movie}) => {

    if(!movie){
        return <p>Can't find movie...</p>
    }

    // const url = "/movies/" + movie.id;

    return(
        <>
            
            <img src={movie.poster} width="200" alt="movie poster" />
        </>
    )
}

export default Movie;