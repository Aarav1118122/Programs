import { useState } from "react";
import axios from "axios";
import LoginParameters from "./LoginParameters";
import { useNavigate } from "react-router-dom";
axios.defaults.withCredentials = true;

export default function Login() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [errorMessage, setErrorMessage] = useState("");

    const navigate = useNavigate();

    const inputEmail = (data) => {
        setEmail(data);
    };
    const inputPassword = (data) => {
        setPassword(data);
    };

    const postlogin = (e) => {
        e.preventDefault();
        axios
            .post("http://localhost:3001/login", {
                email: email,
                password: password,
            })
            .then((response) => {
                if (response.data.username == undefined) {
                    setErrorMessage(response.data.message);
                } else {
                    navigate("/app");
                    window.location.reload();
                }
            });
    };
    // temporary remove after timymce is integrated
    return (
        <div className="login_container">
            <div className="login">
                {/* loginTitle is temporary */}
                <div className="login_header">Login</div>
                <form className="login_form" onSubmit={postlogin}>
                    <LoginParameters type="email" inputValue={inputEmail} />
                    <LoginParameters
                        type="password"
                        inputValue={inputPassword}
                    />
                    <span className="login_wrongpass">{errorMessage}</span>
                    <button className="login_button" type="submit">
                        Log in
                    </button>
                </form>
            </div>
        </div>
    );
}
