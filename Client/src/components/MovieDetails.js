import React from 'react';


const MovieDetail = ({selectedMovie}) => {
    return (
        <div>
            <p>{selectedMovie.title}</p>
            <p>{selectedMovie.description}</p>
        </div>
    );
};

export default MovieDetail;