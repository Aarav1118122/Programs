//please style the signup page
import { useState } from "react";
import axios from "axios";
import SignupParameters from "./SignupParameters";

export default function SignUp() {
    const [email, setEmail] = useState("");
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");
    const [errorMessage, setErrorMessage] = useState("");

    const inputEmail = (data) => {
        setEmail(data);
    };
    const inputUserName = (data) => {
        setUserName(data);
    };
    const inputPassword = (data) => {
        setPassword(data);
    };

    const postSignUp = (e) => {
        e.preventDefault();
        axios
            .post("http://localhost:3001/sign-up", {
                email: email,
                username: userName,
                password: password,
            })
            .then((response) => {
                setErrorMessage(response.data.message);
            });
    };

    return (
        <div className="signup_container">
            <div className="signup">
                <div className="signup_header">Sign Up</div>
                <form className="signup_form" onSubmit={postSignUp}>
                    <SignupParameters type="email" inputValue={inputEmail} />
                    <SignupParameters type="name" inputValue={inputUserName} />
                    <SignupParameters
                        type="password"
                        inputValue={inputPassword}
                    />
                    <span className="signup_wrongpass">{errorMessage}</span>
                    <button className="signup_button">Sign Up</button>
                </form>
            </div>
        </div>
    );
}
