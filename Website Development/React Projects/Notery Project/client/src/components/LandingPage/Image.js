import React from "react";
import promotion from "./Vectorised.png";

function Image() {
    return (
        <div className="main__con2">
            <img src={promotion} alt="promotion" className="main__image" />
            <hr className="main__line" />
        </div>
    );
}

export default Image;