import React from "react";

export default function Header(props) {
  return (
    <header className={`header ${props.colorMode}`}>
      <nav className="header__nav na">
        <span className="nav__elements logo">Periodic Table</span>
        <a href="#" className="nav__elements links">
          Home
        </a>
        <a href="#" className="nav__elements links">
          Electron
        </a>
      </nav>
      <fieldset className="toggle">
        <div className="toggle__container">
          <input
            type="checkbox"
            name="theme"
            className="toggle__input"
            onClick={() => props.toggleColorMode()}
          />
          <span className="toggle__background"></span>
          <span className="toggle__button"></span>
        </div>
      </fieldset>
    </header>
  );
}
