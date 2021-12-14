import React, { useState } from 'react';



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

return (
        <>
        <div>
            <p>{selectedMovie.title}</p>
            <div id ="descript-poster">
            <img id = "detail-poster" src={selectedMovie.poster}></img>
            </div>
            <p>{selectedMovie.description}</p>
            <button onClick = {handleButtonClick}>Close</button>
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


        </div>
        </>

    );
};


export default MovieDetail;