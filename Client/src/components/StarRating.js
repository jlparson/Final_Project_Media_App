import React, { useState } from 'react';
import { FaStar } from 'react-icons/fa';
import "./css/StarRating.css"

const StarRating = ({onRate}) => {

    const [rating, setRating] = useState(null);
    const [hover, setHover] = useState(null);

    const setStarRating = (event) => {
        setRating(event.target.value);
        onRate(event.target.value);
    }

    return (
        <div>
            {[ ... Array(5)].map((star, index) => {
                const ratingValue = index + 1;
                return (
                    <label>
                        <input 
                            type="radio" 
                            name="rating" 
                            value={ratingValue} 
                            onClick={setStarRating} />
                        <FaStar 
                            className="star" 
                            color={ratingValue <= (hover || rating) ? "#ffc107" : "#e4e5e9"} 
                            size={25} 
                            onMouseEnter={() => setHover(ratingValue)}
                            onMouseLeave={() => setHover(null)}
                        />
                    </label>
                );
            })}
            <p>The rating is {rating}</p>
        </div>
    );
};

export default StarRating;