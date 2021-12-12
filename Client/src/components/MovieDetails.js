import React , {useState} from 'react';
import "./css/MovieDetail.css";



const MovieDetail = ({selectedMovie}) => {
    
    
 return (
        <div id = "detail-popup-box">
            
            <p>{selectedMovie.title}</p>
            <div id ="descript-poster">
            <img id = "detail-poster" src={selectedMovie.poster}></img>
            </div>
            <p>{selectedMovie.description}</p>
            <button>Close</button>
        </div>
    );
};

export default MovieDetail;