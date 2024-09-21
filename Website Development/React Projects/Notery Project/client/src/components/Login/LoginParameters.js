import { useState } from "react";

export default function LoginParameters({ type, inputValue }) {
    return (
        <div className={`${type}_parameter login_parameter`}>
            <input
                type={`${type}`}
                name={`${type}`}
                className={`${type}_input login_input`}
                onChange={(e) => {
                    inputValue(e.target.value);
                }}
                required
            />
            <label htmlFor={`${type}`} className={`${type}_label login_label`}>
                <span className={`${type}_text login_text`}>{type}</span>
            </label>
        </div>
    );
}
