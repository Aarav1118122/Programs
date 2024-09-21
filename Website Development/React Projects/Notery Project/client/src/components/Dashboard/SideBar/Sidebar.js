import React from "react";
import Account from "./Account";
import Navigation from "./Navigation";

export default function Sidebar({ username }) {
    return (
        <div className="sidebar">
            <Account username={username} />
            <Navigation />
        </div>
    );
}
