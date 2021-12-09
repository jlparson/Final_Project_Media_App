import React from "react";
import Movie from "./Movie";

const MovieList = ({movies}) => {

    const movieNodes = movies.map((movie,index)=>{
    return(
        <li key = {index}>
            <div><Movie movie ={movie}/></div>
        </li>
    )
    })
    return(
        <ul>
            {movieNodes}
        </ul>
    )
        
        
    
}

export default MovieList;