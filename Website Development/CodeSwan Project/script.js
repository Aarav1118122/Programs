const hamburgerMenu = document.querySelector(".header__hamburger");
const navBar = document.querySelector("#navBar");
hamburgerMenu.addEventListener("click", () => {
    if (hamburgerMenu.classList.contains("open")) {
        hamburgerMenu.classList.remove("open");
        navBar.classList.remove("open");
    } else {
        hamburgerMenu.classList.add("open");
        navBar.classList.add("open");
    }
});
