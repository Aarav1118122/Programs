import React from "react";
import Header from "./Header";
import PeriodicTable from "./PeriodicTable";
import useToggle from "../Hooks/useToggle";
// import Footer from "./MyReactComponents/Footer";

function App() {
  const [mode, toggleMode] = useToggle(false);
  let colorMode;
  if (mode) {
    colorMode = "dark";
  } else {
    colorMode = "light";
  }
  return (
    <>
      <Header toggleColorMode={toggleMode} colorMode={colorMode} />
      <PeriodicTable colorMode={colorMode} />
    </>
  );
}

export default App;
