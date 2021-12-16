import React,{useState, useEffect} from "react";
import MainContainer from "./containers/MainContainer";
import Nav from "./components/Nav";
import Request from "./helpers/request";

function App() {

  const [searchedMovie, setSearchMovie] = useState(null)




    const onSearchMovie = (searchedMovie) =>{
    setSearchMovie(searchedMovie);

    }
    const onSearchbarCloseButtonClick=() =>{
      setSearchMovie(null)

  }

  const handleAddToListFromSearchSubmit = (searchedMovie, searchedList) => {
    
    console.log(searchedMovie)
    console.log(searchedList)
    const movie = searchedMovie;
    const movieid = movie.id
    const searchedListid = searchedList;
    console.log(movieid, searchedListid);
    const request = new Request();
    request.get("/api/savedMovies/"+movieid+"/movielist/"+searchedListid )
    }
  

  return (

  <>
    <Nav onSearchMovie={onSearchMovie} />
    <MainContainer searchedMovie={searchedMovie}  onSearchbarCloseButtonClick={onSearchbarCloseButtonClick}  handleAddToListFromSearchSubmit={handleAddToListFromSearchSubmit}></MainContainer>

  </>
  
  );
    
}

export default App;
