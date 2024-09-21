import { useState, useEffect } from "react";
import Header from "./Header/Header";
import LandingMain from "./LandingPage/Main/LandingMain";
import ContactUs from "./ContactUsPage/Main/Main";
import Footer from "./Footer/Footer";
import Login from "./Login/Login";
import Dashboard from "./Dashboard/Dashboard";
import SignUp from "./Signup/SignUp";
import { Routes, Route, useNavigate } from "react-router-dom";
import axios from "axios";
axios.defaults.withCredentials = true;

export default function App() {
    const [loggedIn, setLoggedIn] = useState(false);
    const [userName, setUserName] = useState("");
    const navigate = useNavigate();
    useEffect(() => {
        axios.get("http://localhost:3001/login").then((response) => {
            if (response.data.loggedIn) {
                setLoggedIn(true);
                setUserName(response.data.username);
                navigate("/app");
            } else {
                navigate("/login");
            }
        });
    }, []);

    return (
        <>
            {loggedIn ? (
                <Routes>
                    <Route
                        path="/app"
                        element={<Dashboard username={userName} />}
                    />
                </Routes>
            ) : (
                <>
                    <Header />
                    <Routes>
                        <Route path="/" element={<LandingMain />} />
                        <Route path="/login" element={<Login />} />
                        <Route path="/sign-up" element={<SignUp />} />
                        <Route path="/contact-us" element={<ContactUs />} />
                    </Routes>
                    <Footer />
                </>
            )}
        </>
    );
}
