import React from "react";
import { Link } from "react-router-dom";
//HEADER

function Navigation() {
    return (
        <div className="header__navigation">
            <div className="nav__links">
                <Link to="/contact-us">Contact Us</Link>
            </div>
            <div className="nav__links">
                <Link to="/help">Help</Link>
            </div>
            <div className="divider__header">|</div>
            <div className="nav__links">
                <Link to="/login">Login</Link>
            </div>
        </div>
    );
}

export default Navigation;
