import React from "react";
import { Link } from "react-router-dom";
//FOOTER

function Navigation() {
    return (
        <div className="footer__navigation">
            <div className="footer__nav__links">
                <Link to="/contact-us">Contact Us</Link>
            </div>
            <div className="footer__nav__links">
                <Link to="/help">Help</Link>
            </div>
            <div className="footer__nav__links">
                <a
                    href="https://github.com/Aarav1118122/Notery-Project"
                    target="_blank"
                >
                    Github
                </a>
            </div>
        </div>
    );
}

export default Navigation;
