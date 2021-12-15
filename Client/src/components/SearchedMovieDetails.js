

import React, { useState } from 'react';



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
            <div id ="descript-poster">
            <button    onClick = {onSearchbarCloseButtonClick}>Close</button>
            <img id = "detail-poster" src={searchedMovie.poster}></img>
            </div>
            <p>{searchedMovie.description}</p>
            
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
            <button id= "save-button" onClick={() => window.location.reload(false)}  type="submit" name="submit" value="Save">Save</button>
            </form> 
            


        </div>
        </>
    
    );

};

export default SearchedMovieDetails;