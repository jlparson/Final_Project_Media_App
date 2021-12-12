import React from 'react';



const MovieDetail = ({selectedMovie, handleAddToListSubmit, list1, list2, list3}) => {
    return (
        <>
        <div>
            <p>{selectedMovie.title}</p>
            <p>{selectedMovie.description}</p>
        </div>
        <div>
            <h3>Add to List</h3>
            <form onSubmit={handleAddToListSubmit}>
            <select id = "dropdown" defaultValue="" >
                <option value={list1}>Recommended</option>
                <option value={list2}>Recently Added</option>
                <option value={list3}>Family Friendly</option>
            </select>
            <input type="submit" name="submit" value="Save" />
            </form>


        </div>
        </>

    );
};

export default MovieDetail;