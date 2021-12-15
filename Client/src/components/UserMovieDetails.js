import React, { useState } from 'react';
import Rating from 'react-simple-star-rating';
import "./css/MovieDetail.css";



const UserMovieDetail = ({selectedMovie, handleAddToListSubmit, list1, list2, list3, onButtonClick, onWatchedButtonClick, handleDeleteFromList, onStarRatingClick}) => {

const [selectedList, setSelectedList] = useState(null);
const [rating, setRating] = useState();

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

const handleStarRatingButton = function(){
    onStarRatingClick(selectedMovie.id)
}

const handleMovieDelete = function(event){
    event.preventDefault();
    handleDeleteFromList(selectedMovie, selectedList)
    // console.log(selectedList);
    
}

return (
        <>
        <div id ="detail-popup-box">
        <div>
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
            <button onClick={() => window.location.reload(false)}  type="submit" name="submit" value="Save">Save</button>
            </form>
            <button onClick={handleMovieDelete} >Delete</button>

            <button onClick = {handleWatchButton}>Watched</button>
            
            <div className='star_rating'>
                <Rating
                    onStarRatingClick={handleStarRatingButton}
                    ratingValue={rating}
                />
            </div>


        </div>
        </div>
        </>

    );
};


export default UserMovieDetail;