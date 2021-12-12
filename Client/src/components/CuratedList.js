import React from "react";
import Movie from "./Movie";
import "./css/MovieList.css";
import MovieDetail from "./MovieDetails";

const CuratedList = ({list1, list2, list3, onMovieClick}) => {

    const curatedList1 = list1.map((movie, index) => {
        return (
            
            <li   key={index} className="list-item">
            <div className="list-item">
            <Movie movie={movie} onMovieClick={onMovieClick}/>
            </div>
            </li>
        )
    })

    const curatedList2 = list2.map((movie, index) => {
        return (
            
            <li key={index} className="list-item">
            <div className="list-item">
            <Movie movie={movie} onMovieClick={onMovieClick}/>
            </div>
            </li>
        )
    })

    const curatedList3 = list3.map((movie, index) => {
        return (
            
            <li key={index} className="list-item">
            <div className="list-item">
            <Movie movie={movie} onMovieClick={onMovieClick}/>
            </div>
            </li>
        )
    })

    return (
        <>
        <br></br><br></br><br></br>
        <h3>Recommended</h3>
        <ul>{curatedList1}</ul>

        <h3>Recently Added</h3>
        <ul>{curatedList2}</ul>

        <h3>Family Friendly</h3>
        <ul>{curatedList3}</ul>
        </>
    )

    }

export default CuratedList;