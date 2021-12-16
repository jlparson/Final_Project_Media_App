import React, {useState} from "react";
import StarRating from "../components/StarRating";
import "./css/MovieList.css";
import Request from "../helpers/request";


const UserMovie = ({movie, onMovieClick, watched, rating, savedMovie}) => {

    const [stateRating, setStateRating] = useState(rating);

    const handleClick = () =>{
        onMovieClick(movie);
       
     }

    const handleRating = (rating) => {
        const request = new Request();
        savedMovie.movie.rating = rating;
        console.log();
        request.patch('/api/savedMovies/'+ savedMovie.movie.id, savedMovie.movie);
    }


    if(!movie){
        return <p>Can't find movie...</p>
    }

    if(watched == false){
        return(
            <>
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
            <p><b><center>Watched: &#10060;</center></b></p>
            <p>Rating: {savedMovie.movie.rating}</p>
            <StarRating onRate={handleRating} ratingProp={savedMovie.movie.rating}/>
            </>
        )
    } else {
        return(
            <>
            <img onClick={handleClick} id = "poster" src={movie.poster}  alt="movie poster" />
            <p><b><center>Watched: &#x2705;</center></b></p>
            <StarRating onRate={handleRating} ratingProp={savedMovie.movie.rating}/>
            </>
        )
    }

}

export default UserMovie;