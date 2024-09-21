import { useState } from "react";

export default function SignupParameters({ type, inputValue }) {
    return (
        <div className={`${type}_parameter signup_parameter`}>
            <input
                type={`${type}`}
                name={`${type}`}
                className={`${type}_input signup_input`}
                onChange={(e) => {
                    inputValue(e.target.value);
                }}
                required
            />
            <label htmlFor={`${type}`} className={`${type}_label signup_label`}>
                <span className={`${type}_text signup_text`}>{type}</span>
            </label>
        </div>
    );
}
