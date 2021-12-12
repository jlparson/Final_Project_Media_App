import React from 'react';
import "./css/MovieDetail.css";


const MovieDetail = ({selectedMovie}) => {
    return (
        <div id = "detail-popup-box">
            <img src="{selectedMovie.poster}"></img>
            <p>{selectedMovie.title}</p>
            <p>{selectedMovie.description}</p>
        </div>
    );
};

export default MovieDetail;