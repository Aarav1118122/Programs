import React from "react";
import { Link } from "react-router-dom";
function Text() {
    return (
        <div className="main__container">
            <div className="main__maintext">
                The Most Effective Way to Keep track.
            </div>
            <div className="main__subtext">Notes, Studies & Reminders.</div>
            <Link to="/sign-up" className="main__signup">
                Sign up now
            </Link>
        </div>
    );
}

export default Text;
