import React from 'react';
import Logo from './Logo';
import Navigation from './Navigation';
import Copyright from "./Copyright";

function Footer() {
    return (
        <footer className='footer'>
            <Navigation />
            <Logo />
            <Copyright />
        </footer>
    );
}

export default Footer;