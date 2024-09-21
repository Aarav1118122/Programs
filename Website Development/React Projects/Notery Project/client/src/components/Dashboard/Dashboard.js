import React, { useState, useEffect } from "react";
import { Routes, Route, useNavigate } from "react-router-dom";
import Sidebar from "./SideBar/Sidebar";
import Notes from "./Notes";
import axios from "axios";
axios.defaults.withCredentials = true;

export default function Dashboard({ username }) {
    const navigate = useNavigate();
    const handleLogout = (e) => {
        e.preventDefault();
        axios.delete("http://localhost:3001/app").then((response) => {
            navigate("/login");
            window.location.reload();
        });
    };

    return (
        <div className="dashboard">
            <button className="logout" onClick={handleLogout}>
                logout
            </button>
            <Sidebar username={username} />
            <Routes>
                <Route path="/app/notes" element={<Notes />} />
            </Routes>
        </div>
    );
}
