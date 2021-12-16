import React, { useState } from "react";
import "./css/SearchBar.css"

function SearchBar(props, searchedMovie){

    const{onSearch} = props;

    const[searchText, setSearchText] = useState("")

    const handelInput = (event) =>{
        const text= event.target.value
        setSearchText(text)
    } 


    const handelEnterKeyPressed = (event) =>{
        if(event.key === 'Enter'){
            onSearch(searchText);
            
        }
    }


        return(
        
            <div className="searchInputs">
                <input type="text" onChange={handelInput} className="input"  placeholder="Search for Movie"
                    onKeyPress={handelEnterKeyPressed} value={searchText}
                />
                
            </div>
            
        )

}

export default SearchBar; 