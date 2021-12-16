

import React, { useState } from 'react';
import "./css/MovieDetail.css";



const SearchedMovieDetails = ({searchedMovie, handleAddToListSubmit, onSearchbarCloseButtonClick, handleAddToListFromSearchSubmit }) => {


    const [searchedList, setSearchedList] = useState(null);
   

const handleSelect = function(event){
    setSearchedList(event.target.value)
    console.log(event.target.value)
}

const handleSubmit = function(event){
        event.preventDefault();
        handleAddToListFromSearchSubmit(searchedMovie, searchedList)
}

        return (

        <>
        <div>
            <p>{searchedMovie.title}</p>
            <div class ="descrip-poster">
            <img class = "detail-poster" src={searchedMovie.poster}></img>
            </div>
            <p>{searchedMovie.description}</p>
            
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
            <button class= "save-button" onClick={() => window.location.reload(false)}  type="submit" name="submit" value="Save">Save</button>
            </form> 
            <button  id ="close-search" onClick = {onSearchbarCloseButtonClick}>Close</button>

            


        </div>
        </>
    
    );

};

export default SearchedMovieDetails;