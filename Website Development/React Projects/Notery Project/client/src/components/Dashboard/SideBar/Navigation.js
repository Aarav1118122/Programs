import React, { useState } from "react";
import { Link } from "react-router-dom";

export default function Navigation() {
    const [title, setTitle] = useState("Title");
    return (
        <>
            <div className="school_planner_button">
                <div className="triangle"></div>
                <div className="text"> Template School Planner</div>
            </div>
            <Link to="/app/notes">
                <div className="notes_button">
                    <div className="triangle"></div>
                    <input
                        type="text"
                        value={title}
                        className="text"
                        onChange={(event) => setTitle(event.target.value)}
                    />
                </div>
            </Link>
            <div className="new_page_button">
                <div>
                    <span></span>
                    <span></span>
                </div>
                <button className="button">New Page</button>
            </div>
        </>
    );
}
