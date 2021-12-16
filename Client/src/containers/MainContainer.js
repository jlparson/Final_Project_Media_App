import React from "react"
import MovieContainer from "./MovieContainer";


const MainContainer = (props) => {

   

    return(


        <MovieContainer onSearchMovie={props.onSearchMovie} searchedMovie={props.searchedMovie} onSearchbarCloseButtonClick={props.onSearchbarCloseButtonClick} handleAddToListFromSearchSubmit={props.handleAddToListFromSearchSubmit}/>
    )
}

export default MainContainer;