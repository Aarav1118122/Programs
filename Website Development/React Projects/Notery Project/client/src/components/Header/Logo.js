import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
function Logo() {
    return (
        <div className="logo_button">
            <Link to="/">Notery</Link>
        </div>
    );
}

export default Logo;
