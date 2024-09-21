import React from "react";
import { Link } from "react-router-dom";
import Facebook from "./Facebook-01.png";
import Twitter from "./Twitter-01.png";
import Github from "./Github-01.png";


function Blocks() {
    return (
        <div className="cu__main__blockcont">
            <div className="cu__main__blocks cu__main__git">
                <span className="cu__main__title">Get in Touch</span>
                <span className="cu__main__sub">Got a question about Notery? are you interested in our work? Have any suggestions?</span>
                <Link to="/contact-us">
                    <a className="cu__button">
                        <button type="button" className="cu__main__but">
                            Contact Us
                        </button>
                    </a>
                </Link>
            </div>
            <div className="cu__main__blocks cu__main__hs">
                <span className="cu__main__title">Help & Support</span>
                <span className="cu__main__sub">Not sure where to start? Need help in using the app? Visit our help center:</span>
                <Link to="/help">
                    <a className="cu__button">
                        <button type="button" className="cu__main__but">
                            Help Center
                        </button>
                    </a>
                </Link>
            </div>
            <div className="cu__main__blocks cu__main__socials">
                <span className="cu__main__socials__title">Other ways to <br />connect</span>
                <div className="socials__container">
                    <img src={Facebook} width="52" />
                    <a className="cu__main__socials__text">Facebook</a>
                </div>
                <div className="socials__container">
                    <img src={Twitter} width="52" />
                    <a className="cu__main__socials__text">Twitter</a>
                </div>
                <div className="socials__container">
                    <img src={Github} width="52" />
                    <a className="cu__main__socials__text">Github</a>
                </div>
            </div>
        </div>
    );
}

export default Blocks;
