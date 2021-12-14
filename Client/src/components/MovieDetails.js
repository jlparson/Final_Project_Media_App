import React, { useState } from 'react';
import "./css/MovieDetail.css";
import Youtube from "react-youtube";


const MovieDetail = ({selectedMovie, handleAddToListSubmit, list1, list2, list3, onButtonClick}) => {

const [selectedList, setSelectedList] = useState(null);

const handleSelect = function(event){
    setSelectedList(event.target.value)
    console.log(event.target.value)
}

const handleSubmit = function(event){
        event.preventDefault();
        handleAddToListSubmit(selectedMovie, selectedList)}

const handleButtonClick = function(event){
    onButtonClick()
}

const opts = {
    height:"330",
    width: "30%",
    playerVars: {
        // https://developers.google.com/youtube/player_parameters
        autoplay: 1,
    },
};

return (
        <>
        <div id ="detail-popup-box">
        <div>
            <Youtube videoId={selectedMovie.trailer} opts={opts} />
            <p>{selectedMovie.title}</p>
            <div id ="descript-poster">
            <img id = "detail-poster" src={selectedMovie.poster}></img>
            </div>
            <p>{selectedMovie.description}</p>
            <button id = "close-button" onClick = {handleButtonClick}>X</button>
        </div>
        <div>
            <h3>Add to List</h3>
            <form onSubmit={handleSubmit}>
            <select id = "dropdown" defaultValue="" onChange={handleSelect}>
                <option selected="selected">Please select...</option>
                <option value="4">Favourite Movies</option>
                <option value="5">Watch Later</option>
                <option value="6">Movies for the kids</option>

            </select>
            <input type="submit" name="submit" value="Save" />
            </form>

            {/* <button onClick = {handleWatchedStatus}>Watched</button> */}


        </div>
        </div>
        </>

    );
};


export default MovieDetail;