import React from "react";

export default function Account({ username }) {
    return (
        <div className="account">
            <div className="account_name">{username}</div>
            <div className="triangle"></div>
        </div>
    );
}
