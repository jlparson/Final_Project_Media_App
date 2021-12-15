import React, { useState } from 'react';
import "./css/MovieDetail.css";
import Youtube from "react-youtube";



const UserMovieDetail = ({selectedMovie, handleAddToListSubmit, list1, list2, list3, onButtonClick, onWatchedButtonClick, handleDeleteFromList}) => {

const [selectedList, setSelectedList] = useState(null);

const handleSelect = function(event){
    setSelectedList(event.target.value)
    console.log(event.target.value)
}

const handleSubmit = function(event){
        event.preventDefault();
        handleAddToListSubmit(selectedMovie, selectedList)}

const handleButtonClick = function(){
    onButtonClick()
}

const handleWatchButton = function(){
    onWatchedButtonClick(selectedMovie.id)
}

const handleMovieDelete = function(event){
    event.preventDefault();
    handleDeleteFromList(selectedMovie, selectedList)
    // console.log(selectedList);
    
}

const opts = {
    height:"330",
    width: "30%",
    playerVars: {
        // https://developers.google.com/youtube/player_parameters
        autoplay: 0,
    },
};

return (
        <>
        <div class ="detail-popup-box">
            <h3>{selectedMovie.title}</h3>
            <div class = "trailer">
            <Youtube  videoId={selectedMovie.trailer} opts={opts} />
            </div>
            <div>
            <div class ="descrip-poster">
            <img class = "detail-poster" src={selectedMovie.poster}></img>
            
            <div class = "description">
            <p>{selectedMovie.description}</p>
            </div>
            <div class = "movie-info">
                <p class ="movie-info-element">Genre: {selectedMovie.genre}</p>
                <p class ="movie-info-element">Release date: {selectedMovie.releaseDate}</p>
                <a  class ="movie-info-element" href = {selectedMovie.moreInfo}> Click for More Info</a>
                <br/>
                <a class="button" href={selectedMovie.provider}>Watch now</a>
            </div>
            
        
        <div>
            <h3>Add to List</h3>
            <form onSubmit={handleSubmit}>
            <select class = "dropdown" defaultValue="" onChange={handleSelect}>
                <option selected="selected">Please select...</option>
                <option value="4">Favourite Movies</option>
                <option value="5">Watch Later</option>
                <option value="6">Movies for the kids</option>

            </select>
            <button  class = "save-button" onClick={() => window.location.reload(false)}  type="submit" name="submit" value="Save">Save</button>
            </form>
            
            <button  id = "delete-button" onClick={handleMovieDelete} >Delete</button>

            <button onClick = {handleWatchButton} >Watched</button>




        </div>
        </div>
        </div>
        <button class = "close-button" onClick = {handleButtonClick}>X</button>
        </div>
        </>

    );
};


export default UserMovieDetail;