import React, { useState, useEffect } from 'react';
import "./css/Nav.css";

function Nav() {
    const [show, handleShow] = useState(false);

    useEffect(() => {
        window.addEventListener("scroll", () => {
            if (window.scrollY > 100) {
                handleShow(true);
            } else handleShow(false);
        });
        return () => {
            window.removeEventListener("scroll");
        }
    }, []);

    return (
        <div className={`nav ${show && "nav_background"}`}>
            <img
                className="nav_logo"
                src="https://i.postimg.cc/15T5z2h2/Getflix3.png"
                alt="Getflix Logo"
            />

            <img
                className="nav_avatar"
                src="https://i.postimg.cc/VNXjgXWs/Getflix-User.png"
                alt="Getflix Avatar"
            />
        </div>
    )
}

export default Nav
